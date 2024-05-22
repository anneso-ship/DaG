
		/************Administrateur*****************/
		Administrator admin = new Administrator(
				"Bamoni",
				"Anne Sophie",
				"anneSophieBamoni@mairie.fr", // Ajout de l'email manquant
				"07 52 38 95 21",
				encoder.encode("vbyATCNDVTYYvtyvyESEZA"),
				UsersType.ADMINISTRATOR.name(),
				new Date(),
				new Date()
				);
				administratorRepository.save(admin);

        /*********Agents*********/
		agentRepository.save(new Agent("Mboumba", "Evelyne", "evelyneMboumba@mairie.fr", "06 79 78 45", encoder.encode("agent1"), UsersType.MODERATOR.name(), "Département 1", new Date()));
		agentRepository.save(new Agent("Ndouna", "Christophe", "ndouna@mairie.fr", "06 89 99 99", encoder.encode("agent2"), UsersType.MODERATOR.name(), "Département 2", new Date()));
		agentRepository.save(new Agent("Lendoye", "Carle Hugo", "lendoyeCarle@hotmail.fr", "07 99 00 45", encoder.encode("agent3"), UsersType.MODERATOR.name(), "Département 3", new Date()));
		agentRepository.save(new Agent("Mezui", "Elsa", "elsaMezui@mairie.fr", "07 99 99 99", encoder.encode("agent4"), UsersType.MODERATOR.name(), "Département 4", new Date()));

        /*********Utilisateur*********/
        userRepository.save(new User("Nze", "Dominique","026&é;,", encoder.encode("user1"), "nzeDom@yahoo.fr", "06 45 89 99", "user", "Unknown"));
        userRepository.save(new User("Obame", "Sarah", "...36+-*74/", encoder.encode("user2"), "obame_sarah@hotmail.fr", "07 88 88 11", "user", "Unknown"));
        userRepository.save(new User("Kombila", "Robert", "896+-*.", encoder.encode("user3"), "kombilaRob89@gmail.fr", "05 66 81 90", "user", "Unknown"));
        userRepository.save(new User("Lendoye", "Lence Junior", "0./*7448", encoder.encode("user4"), "LendoyeLence@hotmail.com", "02 88 88 11", "user", "Unknown"));

    

/********************Création des actes de naissances********************/
				birthCertificateRepository.save(new BirthCertificate( "Mburu","Charlène","F",new Date(99, 3, 25),"Gabon","Mburu","Elisabeth",new Date(70, 3, 12),"Coiffeuse","Gabon","Mburu","Richard",new Date(65, 12, 12),"Ebèniste","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Obame","Sarah","F",new Date(100, 11, 15),"Gabon"," Mba'a ","Cynthia",new Date(85, 4, 6),"Sans-emploi","Gabon","Obame","Serge",new Date(84, 8, 1),"Chauffeur de taxi","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Mitogo","Chelsea Carla Marise","F",new Date(101, 8, 7),"Gabon","Ndong","Elise",new Date(75, 4, 12),"Coiffeuse","Gabon","Mitogo","Jean Claude",new Date(65, 12, 12),"Ministre de la défense","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Bekale","Ashley","F",new Date(106, 12, 25),"Gabon"," Bekale ","Myriame",new Date(73, 2, 20),"Sans-emploi","Gabon","Bekale","Eric",new Date(69, 5, 1),"Ingénieur aéronautique","Gabon"));
				birthCertificateRepository.save(new BirthCertificate("Essono","Gilles","M",new Date(95, 5, 9),"Gabon","Essono","Viviane",new Date(80, 1, 1),"Caissière","Gabon","Essono","Victor",new Date(65, 9, 2),"Chauffeur de bus", "Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Assengone","Christopher","M",new Date(108, 5, 29),"Gabon","Kakiesse","Laura",new Date(88, 11, 8),"Développeuse fullstack","Congolaise","Assengone","Charles",new Date(79, 12, 01),"Cardiologue", "Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Diawara","Hugo","M",new Date(90, 4, 4),"Gabon","Diawara","Sylvie",new Date(70, 7, 13),"Sage femme","Gabon","Diawara","Rémy",new Date(75, 6, 9),"Pilote de ligne","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Lendoye","Lence Junior","M",new Date(101, 5, 5),"Gabon","Ndong","Alya",new Date(80, 3, 5),"Esthéticienne","Gabon","Lendoye","Lence",new Date(60, 12, 26),"Enseignant", "Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Alevina","Herve","M",new Date(91, 10, 4),"Gabon","Otoumba","Evelyne",new Date(75, 7, 13),"Commercante","Gabon","Alevina","Marc",new Date(65, 2, 3),"Homme d'affaires","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Obone","Mariah","F",new Date(105, 2, 3), "Gabon", "Obone", "Siam", new Date(70, 3, 31), "Infirmière", "Gabon", "Obone", "Robert", new Date(65, 1, 4), "Garagiste", "Gabon" ));
				birthCertificateRepository.save(new BirthCertificate( "Bouanga","Evelyne","F",new Date(92, 3, 2),"Gabon","Bouanga","Elisabeth",new Date(72, 3, 1),"Femme au foyer","Gabon","Bouanga","Richard",new Date(70, 12, 1),"Juriste","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Avomo","Sarah","F",new Date(100, 11, 15),"Gabon"," Mba'a ","Cynthia",new Date(85, 4, 6),"Sans-emploi","Gabon","Avomo","Richard",new Date(80, 2, 2),"Policier","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Mihindou","Eva","F",new Date(116, 8, 8),"Gabon","Ndong","Elise",new Date(75, 4, 12),"Coiffeuse","Gabon","Mihindou","Nathan",new Date(65, 12, 12),"Ministre de la défense","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Mayombo","Danielle","F",new Date(119, 12, 25),"Gabon"," Mayombo ","Mya",new Date(73, 2, 20),"Sans-emploi","Gabon","Mayombo","Dan",new Date(69, 5, 1),"Ingénieur d'affaire","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Kombila","Robert","M",new Date(117, 5, 9),"Belge","Kombila","Kelly",new Date(79, 3, 6),"Chirurgienne plastique","Gabon","Kombila","Rémy",new Date(65, 9, 12),"Secrétaire (Histoire)", "Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Zabwi","Eric","M",new Date(95, 4, 2),"Gabon","Otoumba","Evelyne",new Date(70, 7, 13),"Ingénieure en finance","Gabon","Zabwi","George",new Date(75, 6, 9),"Ingénieur informatique","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Nkassa","Victor","M",new Date(102, 5, 29),"Gabon","Ndong","Alya",new Date(80, 3, 5),"Esthéticienne","Gabon","Nkassa","Jean Marie",new Date(60, 12, 26),"Enseignant", "Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Koffi","Olympe Emmanuel","M",new Date(99, 10, 31),"Gabon","Otoumba","Evelyne",new Date(75, 7, 13),"Ingénieure en finance","Gabon","Koffi","Olivier",new Date(65, 2, 3),"Ingénieur informatique","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Obone","Mireille","F",new Date(105, 2, 3), "Gabon", "Obone", "Siam", new Date(70, 3, 31), "Infirmière", "Gabon", "Obone", "Robert", new Date(65, 1, 4), "Concierge", "Gabon" ));
				birthCertificateRepository.save(new BirthCertificate( "Bouanga","Pamela","F",new Date(92, 3, 2),"Gabon","Bouanga","Elisabeth",new Date(72, 3, 1),"Femme au foyer","Gabon","Bouanga","Richard",new Date(70, 12, 1),"Plombier","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Avomo","Nathalie","F",new Date(100, 11, 15),"Gabon"," Mba'a ","Cynthia",new Date(85, 4, 6),"Sans-emploi","Gabon","Avomo","Richard",new Date(80, 2, 2),"Medecin","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Mihindou","Rita","F",new Date(116, 8, 8),"Gabon","Ndong","Elise",new Date(75, 4, 12),"Coiffeuse","Gabon","Mihindou","Nathan",new Date(65, 12, 12),"Maitre d'ecole","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Mayombo","Jessica","F",new Date(119, 12, 25),"Gabon"," Mayombo ","Mya",new Date(73, 2, 20),"Sans-emploi","Gabon","Mayombo","Dan",new Date(69, 5, 1),"Pompier","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Kombila","Willy","M",new Date(117, 5, 9),"Belge","Kombila","Kelly",new Date(79, 3, 6),"Chirurgienne plastique","Gabon","Kombila","Rémy",new Date(65, 9, 12),"Médecin généraliste", "Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Bessaque","Cédric","M",new Date(108, 5, 29),"Gabon","Ndomo","Celestine",new Date(76, 3, 31),"Docteur en psychologie du travail","Gabon","Bessaque","Richard Herve Gilles",new Date(60, 12, 26),"Dresseur d'animaux", "Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Zabwi","Glenn","M",new Date(95, 4, 2),"Gabon","Otoumba","Evelyne",new Date(70, 7, 13),"Ingénieure en finance","Gabon","Zabwi","George",new Date(75, 6, 9),"Commercant","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Nkassa","Boris","M",new Date(102, 5, 29),"Gabon","Ndong","Alya",new Date(80, 3, 5),"Esthéticienne","Gabon","Nkassa","Jean Marie",new Date(60, 12, 26),"Cuisinnier", "Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Koffi","Sylvain","M",new Date(99, 10, 31),"Gabon","Otoumba","Evelyne",new Date(75, 7, 13),"Ingénieure en finance","Gabon","Koffi","Olivier",new Date(65, 2, 3),"Chef patissier","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Bamoni","Anne - Sophie","F",new Date(98, 10, 03),"Gabon","Yalanzele","Vanessa Sophie",new Date(76, 3, 31),"Etudiante","Gabon","Loubamono Bessaque","Guy Claver",new Date(60, 1, 26),"Enseignant d'histoire","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Onanga","Romain","M",new Date(113, 10, 5),"Gabon","Onanga","Tina",new Date(75, 7, 13),"Ingénieure en finance","Gabon","Onanga","Vivien",new Date(65, 2, 3),"Chef patissier","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Eboumi","Johnson","F",new Date(117, 1, 8), "Gabon", "Eboumi", "Darla", new Date(92, 3, 3), "Couturière", "Gabon", "Eboumi", "Peter", new Date(77, 1, 9), "Développeur Web Fullstack", "Gabon" ));
				birthCertificateRepository.save(new BirthCertificate( "Ondo","Pamela","F",new Date(92, 3, 2),"Gabon","Ondo","Céline",new Date(72, 3, 1),"Femme au foyer","Gabon","Ondo","Georges Sylvain",new Date(55, 12, 11),"Homme d'affaire (import export)","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Ntoutoume","Ada Delphine","F",new Date(99, 10, 2),"Gabon"," Ntoutoume ","Sonia",new Date(85, 4, 1),"Sans-emploi","Gabon","Ntoutoume","Jacob",new Date(80, 2, 2),"Medecin","Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Nziengui ","Olivia","F",new Date(116, 8, 8),"Gabon","Nziengui","Elise",new Date(70, 4, 4),"Couturière","Gabon","Nziengui ","Thomas",new Date(65, 12, 12),"Agent de mairie","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Mezui","Léa","F",new Date(120, 12, 25),"Gabon"," Mayombo ","Mezui",new Date(73, 2, 20),"Informaticienne","Gabon","Mezui","Edouard",new Date(69, 5, 1),"Pneumologue","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Makaya","William","M",new Date(117, 5, 9),"Gabon","Kombila","Kelly",new Date(79, 3, 6),"Chirurgienne plastique","Gabon","Makaya","Rémy",new Date(65, 9, 12),"Médecin généraliste", "Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Bouassa","Cédric","M",new Date(108, 5, 29),"Gabon","Ndomo","Celestine",new Date(76, 3, 31),"Docteur en psychologie du travail","Gabon","Bouassa","Richard Herve Gilles",new Date(60, 12, 26),"Dresseur d'animaux", "Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Pambo","Glenn","M",new Date(95, 4, 2),"Gabon","Pambo","Raissa",new Date(70, 7, 13),"Ingénieure en finance","Gabon","Pambo","George",new Date(75, 6, 9),"Commercant","Gabon"));
				birthCertificateRepository.save(new BirthCertificate( "Nkassa","Dorian","M",new Date(102, 5, 29),"Gabon","Ndong","Alya",new Date(80, 3, 5),"Esthéticienne","Gabon","Nkassa","Jean Marie",new Date(60, 12, 26),"Cuisinnier", "Gabon"));

				birthCertificateRepository.save(new BirthCertificate( "Ondo","Dominic","M",new Date(113, 10, 5),"Gabon","Otoumba","Evelyne",new Date(75, 7, 13),"Ingénieure en finance","Gabon","Koffi","Olivier",new Date(65, 2, 3),"Chef patissier","Gabon"));
		   
		   
		   
		   
		   
		   
		   
		   
		    
       
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
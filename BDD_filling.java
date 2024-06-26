administratorRepository.save(new Administrator("Bamoni", "Anne Sophie", "anneSophieBamoni@mairie.fr", "07 52 38 95 21", encoder.encode("vbyATCNDVTYYvtyvyESEZA"), UsersType.ADMINISTRATOR.name(), new Date(), new Date()));


		/********** Création des UTILISATEURS **********/
		User user1 = new User("Nze", "Dominique", "nzeDom@yahoo.fr", "06 45 89 99", encoder.encode("user1"), UsersType.USER.name(), 'M', new Date(80, 6, 15), null);
		User user2 = new User("Obame", "Sarah", "obame_sarah@hotmail.fr", "07 88 88 11", encoder.encode("user2"), UsersType.USER.name(), 'F', new Date(92, 4, 23), null);
		User user3 = new User("Kombila", "Robert", "kombilaRob89@gmail.fr", "05 66 81 90", encoder.encode("user3"), UsersType.USER.name(), 'M', new Date(85, 9, 12), null);
		User user4 = new User("Lendoye", "Lence Junior", "LendoyeLence@hotmail.com", "02 88 88 11", encoder.encode("user4"), UsersType.USER.name(), 'M', new Date(90, 11, 30), null);
		User user5 = new User("Mboumba", "Caroline", "mboumbaCaroline@gmail.com", "06 77 55 44", encoder.encode("user5"), UsersType.USER.name(), 'F', new Date(83, 2, 19), null);
		User user6 = new User("Ngoua", "Vincent", "ngouaVincent@yahoo.fr", "09 33 22 11", encoder.encode("user6"), UsersType.USER.name(), 'M', new Date(87, 5, 10), null);
		User user7 = new User("Mve", "Alice", "mveAlice@hotmail.fr", "07 66 55 44", encoder.encode("user7"), UsersType.USER.name(), 'F', new Date(91, 8, 22), null);
		User user8 = new User("Ossou", "Jean-Pierre", "ossouJeanPierre@gmail.com", "08 44 33 22", encoder.encode("user8"), UsersType.USER.name(), 'M', new Date(89, 1, 25), null);
		User user9 = new User("Edjanga", "Patricia", "edjangaPatricia@yahoo.fr", "06 55 44 33", encoder.encode("user9"), UsersType.USER.name(), 'F', new Date(94, 11, 15), null);
		User user10 = new User("Manga", "Didier", "mangaDidier@hotmail.com", "05 22 11 00", encoder.encode("user10"), UsersType.USER.name(), 'M', new Date(82, 3, 5), null);
		User user11 = new User("Nguema", "Paul", "nguemaPaul@gmail.com", "09 77 66 55", encoder.encode("user11"), UsersType.USER.name(), 'M', new Date(90, 5, 17), null);
		User user12 = new User("Biyoghé", "Marie-Louise", "biyogheMarieLouise@yahoo.fr", "07 66 55 44", encoder.encode("user12"), UsersType.USER.name(), 'F', new Date(87, 8, 3), null);
		User user13 = new User("Ono", "Serge", "onoSerge@hotmail.com", "04 33 22 11", encoder.encode("user13"), UsersType.USER.name(), 'M', new Date(95, 10, 20), null);

		/********** Sauvegarde des utilisateurs **********/
		userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));

		/********** Création des agents **************/
		Agent agent1 = new Agent("Mboumba", "Evelyne", "evelyneMboumba@mairie.fr", "06 79 78 45", encoder.encode("agent1"), UsersType.MODERATOR.name(), "Département 1", new Date(), null);
		Agent agent2 = new Agent("Ndouna", "Christophe", "ndouna@mairie.fr", "06 89 99 99", encoder.encode("agent2"), UsersType.MODERATOR.name(), "Département 2", new Date(), null);
		Agent agent3 = new Agent("Lendoye", "Carle Hugo", "lendoyeCarle@hotmail.fr", "07 99 00 45", encoder.encode("agent3"), UsersType.MODERATOR.name(), "Département 3", new Date(), null);
		Agent agent4 = new Agent("Mezui", "Elsa", "elsaMezui@mairie.fr", "07 99 99 99", encoder.encode("agent4"), UsersType.MODERATOR.name(), "Département 4", new Date(), null);
		Agent agent5 = new Agent("Biyogo", "Patrice", "patriceBiyogo@mairie.fr", "06 67 89 45", encoder.encode("agent5"), UsersType.MODERATOR.name(), "Département 5", new Date(), null);
		Agent agent6 = new Agent("Mavoungou", "Jeanne", "jeanneMavoungou@mairie.fr", "06 88 77 66", encoder.encode("agent6"), UsersType.MODERATOR.name(), "Département 6", new Date(), null);
		Agent agent7 = new Agent("Ekome", "Bernard", "bernardEkome@mairie.fr", "06 55 44 33", encoder.encode("agent7"), UsersType.MODERATOR.name(), "Département 7", new Date(), null);
		Agent agent8 = new Agent("Ngoma", "Fabienne", "fabienneNgoma@mairie.fr", "07 77 66 55", encoder.encode("agent8"), UsersType.MODERATOR.name(), "Département 8", new Date(), null);
		Agent agent9 = new Agent("Ossibi", "Laurent", "laurentOssibi@mairie.fr", "07 88 99 00", encoder.encode("agent9"), UsersType.MODERATOR.name(), "Département 9", new Date(), null);
		Agent agent10 = new Agent("Tchibinda", "Marie", "marieTchibinda@mairie.fr", "06 44 33 22", encoder.encode("agent10"), UsersType.MODERATOR.name(), "Département 10", new Date(), null);


		Agent agent1 = new Agent("Diallo", "Fatou", "fatouDiallo@mairie.fr", "06 22 33 44", encoder.encode("agent1"), UsersType.MODERATOR.name(), "Département 1", new Date(), null);
		Agent agent2 = new Agent("Bamba", "Issa", "issaBamba@mairie.fr", "06 11 22 33", encoder.encode("agent2"), UsersType.MODERATOR.name(), "Département 2", new Date(), null);
		Agent agent3 = new Agent("Zongo", "Aminata", "aminataZongo@mairie.fr", "07 66 55 44", encoder.encode("agent3"), UsersType.MODERATOR.name(), "Département 3", new Date(), null);
		Agent agent4 = new Agent("Koulibaly", "Moussa", "moussaKoulibaly@mairie.fr", "07 77 88 99", encoder.encode("agent4"), UsersType.MODERATOR.name(), "Département 4", new Date(), null);
		Agent agent5 = new Agent("Diop", "Awa", "awaDiop@mairie.fr", "06 33 44 55", encoder.encode("agent5"), UsersType.MODERATOR.name(), "Département 5", new Date(), null);
		Agent agent6 = new Agent("Kone", "Seydou", "seydouKone@mairie.fr", "06 88 77 66", encoder.encode("agent6"), UsersType.MODERATOR.name(), "Département 6", new Date(), null);
		Agent agent7 = new Agent("Traore", "Kadi", "kadiTraore@mairie.fr", "06 99 88 77", encoder.encode("agent7"), UsersType.MODERATOR.name(), "Département 7", new Date(), null);
		Agent agent8 = new Agent("Ouattara", "Salimata", "salimataOuattara@mairie.fr", "07 44 33 22", encoder.encode("agent8"), UsersType.MODERATOR.name(), "Département 8", new Date(), null);

		Agent agent9 = new Agent("Mounguengui", "François", "francoisMounguengui@mairie.fr", "07 55 66 77", encoder.encode("agent9"), UsersType.MODERATOR.name(), "Département 9", new Date(), null);
		Agent agent10 = new Agent("Yembi", "Clarisse", "clarisseYembi@mairie.fr", "06 88 99 00", encoder.encode("agent10"), UsersType.MODERATOR.name(), "Département 10", new Date(), null);
		Agent agent11 = new Agent("Missandou", "Jacques", "jacquesMissandou@mairie.fr", "06 11 22 33", encoder.encode("agent11"), UsersType.MODERATOR.name(), "Département 11", new Date(), null);


		/********** Sauvegarde des agents **********/
		agentRepository.saveAll(Arrays.asList(agent1, agent2, agent3, agent4, agent5, agent6, agent7, agent8, agent9, agent10));

		/********** Création des procédures **********/
		Procedure procedure1 = new Procedure("INFORMATISATION", "Informatiser un acte de naissances existant", new Date(), null, Status.EN_ATTENTE.name(), procedureService.RandomGeneratorNumber(), user1, agent5, Arrays.asList("acte_naissance.pdf", "pieces.pdf"));
		Procedure procedure2 = new Procedure("DEMANDE", "Demande d'acte de naissance", new Date(), null, Status.EN_COURS.name(), procedureService.RandomGeneratorNumber(), user2, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure3 = new Procedure("INFORMATISATION", "Informatiser un acte de naissances existant",new Date(), null, Status.EN_ATTENTE.name(), procedureService.RandomGeneratorNumber(), user3, null, Arrays.asList("acte_naissance.pdf", "pieces.pdf", "document.pdf"));
		Procedure procedure4 = new Procedure("DEMANDE", "Demande d'acte de naissance", new Date(), null, Status.EN_COURS.name(), procedureService.RandomGeneratorNumber(), user4, agent3, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure5 = new Procedure("INFORMATISATION", "Informatiser un acte de naissances existant",new Date(122, 5, 8), new Date(122, 5, 19), Status.REJETEE.name(), procedureService.RandomGeneratorNumber(), user5, agent7, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf", "document4.pdf"));
		Procedure procedure6 = new Procedure("DEMANDE", "Demande d'acte de naissance",new Date(), null, Status.TERMINEE.name(), procedureService.RandomGeneratorNumber(), user6, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure7 = new Procedure("INFORMATISATION", "Informatiser un acte de naissances existant", new Date(), null, Status.TERMINEE.name(), procedureService.RandomGeneratorNumber(), user7, agent4, Arrays.asList("acte_naissance.pdf", "pieces.pdf"));
		Procedure procedure8 = new Procedure("DEMANDE", "Demande d'acte de naissance",new Date(124, 6, 1), new Date(124, 6, 15), Status.REJETEE.name(), procedureService.RandomGeneratorNumber(), user8, agent10, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure9 = new Procedure("INFORMATISATION", "Informatiser un acte de naissances existant",new Date(123, 1, 5), new Date(123, 1, 20), Status.TERMINEE.name(), procedureService.RandomGeneratorNumber(), user9, null, Arrays.asList("acte_naissance.pdf", "pieces.pdf"));
		Procedure procedure10 = new Procedure("DEMANDE","Demande d'acte de naissance", new Date(), null, Status.REJETEE.name(), procedureService.RandomGeneratorNumber(), user10, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure11 = new Procedure("INFORMATISATION", "Informatiser un acte de naissances existant",new Date(), null, Status.REJETEE.name(), procedureService.RandomGeneratorNumber(), user2, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf", "document4.pdf"));
		Procedure procedure12 = new Procedure("DEMANDE","Demande d'acte de naissance", new Date(124, 2, 1), null, Status.TERMINEE.name(), procedureService.RandomGeneratorNumber(), user3, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure13 = new Procedure("DEMANDE", "Demande de certificat de résidence", new Date(), null, Status.EN_ATTENTE.name(), procedureService.RandomGeneratorNumber(), user11, null, Arrays.asList("document1.pdf", "document2.pdf"));
		Procedure procedure14 = new Procedure("RENOUVELLEMENT", "Renouvellement de carte d'identité", new Date(), null, Status.EN_COURS.name(), procedureService.RandomGeneratorNumber(), user12, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf"));
		Procedure procedure15 = new Procedure("MODIFICATION", "Modification d'un acte de naissance", new Date(), null, Status.EN_COURS.name(), procedureService.RandomGeneratorNumber(), user13, null, Arrays.asList("document1.pdf", "document2.pdf", "document3.pdf", "document4.pdf"));

		/********** Sauvegarde des procédures **********/
		procedureRepository.saveAll(Arrays.asList(procedure1, procedure2, procedure3, procedure4, procedure5, procedure6, procedure7, procedure8, procedure9, procedure10, procedure11, procedure12));


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






//procedureRepository.save(new Procedure("INFORMATISATION", new Date(), null, Status.EN_ATTENTE.name(), procedureService.RandomGeneratorNumber(), userRepository.findById(1L).get(), null, Arrays.asList("document1.pdf", "document2.pdf")));



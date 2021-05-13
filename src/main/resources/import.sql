INSERT INTO estado values (1, 'São Paulo', 'SP');
INSERT INTO estado values (2, 'Rio de Janeiro', 'RJ');
INSERT INTO estado values (3, 'Pernambuco', 'PE');
INSERT INTO estado values (4, 'Paraná', 'PR');
INSERT INTO estado values (5, 'Rio Grande do Sul', 'RS');

INSERT INTO cidade values (10, 'São Paulo', 1);
INSERT INTO cidade values (20, 'Jandira', 1);
INSERT INTO cidade values (30, 'Porto Alegre', 5);
INSERT INTO cidade values (40, 'Gramado', 5);
INSERT INTO cidade values (50, 'Angra dos Reis', 2);
INSERT INTO cidade values (60, 'Rio de Janeiro', 2);

INSERT INTO destino values (100, '2021-02-15', 'Famosa pela praia em forma de meia-lua, Copacabana é um dos bairros mais animados do Rio. Ela atrai moradores e turistas para atividades ininterruptas nas suas areias e no calçadão desenhado. Entre os arranha-céus com vista para a praia, estão o hotel Copacabana Palace em estilo art déco e o exuberante Forte de Copacabana, que abriga um museu militar. Mais para dentro do bairro, cafés descontraídos e bares casuais enchem as ruas sossegadas.', 'Copacabana', 500, 60);
INSERT INTO destino values (200, '2021-03-15', 'O Ibirapuera é um bairro nobre localizado na região centro-sul da capital paulista, no distrito de Moema, e cortado pela Avenida Indianópolis. Limita-se com os bairros de: Paraíso, Vila Nova Conceição e Jardim Lusitânia e a região dos Jardins.', 'Ibirapuera', 200, 10);
INSERT INTO destino values (300, '2021-03-25', 'A Escola SENAI “Prof. Vicente Amato” é considerada referência em educação profissional em sua região de atuação. Localizada no município de Jandira, grande São Paulo, atende também o município de Itapevi e ainda a cidade de Barueri, em algumas áreas específicas. Ao longo de dezoito anos, a escola sempre buscou oferecer cursos à comunidade em geral, propiciando o desenvolvimento de profissionais para atender as demandas do mercado de trabalho.', 'Senai Jandira', 0, 20);
INSERT INTO destino values (400, '2021-04-29', 'Cristo Redentor é uma estátua art déco que retrata Jesus Cristo, localizada no topo do morro do Corcovado, a 709 metros acima do nível do mar, no Parque Nacional da Tijuca, com vista para a maior parte da cidade do Rio de Janeiro, Brasil. Em 2007 foi eleito informalmente como uma das sete maravilhas do mundo moderno.', 'Cristo Redentor', 500, 60);
INSERT INTO destino values (500, '2021-04-29', 'Monumento Natural dos Morros do Pão de Açúcar e da Urca é um complexo de morros localizado no bairro da Urca, na cidade do Rio de Janeiro, no Brasil. É composto pelo Morro do Pão de Açúcar e pelo Morro da Urca.', 'Pão de Açúcar', 300, 60);
INSERT INTO destino values (600, '2021-04-29', 'O Museu de Arte de São Paulo é um museu privado sem fins lucrativos, fundado em 1947 pelo empresário e mecenas Assis Chateaubriand (1892-1968), tornando-se o primeiro museu moderno no país. Chateaubriand convidou o crítico e marchand italiano Pietro Maria Bardi (1900-1999) para dirigir o MASP, e Lina Bo Bardi (1914-1992) para desenvolver o projeto arquitetônico e expográfico. Mais importante acervo de arte europeia do Hemisfério Sul, hoje a coleção do MASP reúne mais de 11 mil obras, incluindo pinturas, esculturas, objetos, fotografias, vídeos e vestuário de diversos períodos, abrangendo a produção europeia, africana, asiática e das Américas.', 'MASP', 68.99, 10);
INSERT INTO destino values (700, '2021-05-09', 'Pico do Jaraguá é um dos pontos mais altos do município de São Paulo, no Brasil, elevando-se a uma altitude de 1 135 metros. Situa-se no bairro do Jaraguá, a oeste da serra da Cantareira. Nos seus arredores, foi criado o Parque Estadual do Jaraguá, para conservação da área.', 'Pico do Jaraguá', 0.0, 10);

INSERT INTO foto values (1, true, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fcopacabana.jpg?alt=media&token=2881865b-7df9-4adb-bd88-99f2727de8c1', 100);
INSERT INTO foto values (2, false, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fcopacabana2.jpg?alt=media&token=96133e04-8255-v', 100);
INSERT INTO foto values (3, false, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fcopacabana3.jpg?alt=media&token=4589f003-1ed4-45ef-b56c-f8710e6ca267', 100);
INSERT INTO foto values (4, false, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fmasp.jpg?alt=media&token=36d94dfa-d13c-43c7-a2ff-8db49033ba5f', 600);
INSERT INTO foto values (5, false, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fmasp2.jpg?alt=media&token=84fcb255-29fe-4554-8c26-e58ae5a6819d', 600);
INSERT INTO foto values (6, true, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fmasp3.jpg?alt=media&token=3b06b572-dcf5-4afb-9106-cd3d8e576561', 600);
INSERT INTO foto values (7, true, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fibira.jpg?alt=media&token=ee87b963-591a-46a6-99da-3805c4e3fe6f', 200);
INSERT INTO foto values (8, false, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fibira2.jpg?alt=media&token=1a1a1ab2-34cf-4144-bc74-72c23394b508', 200);
INSERT INTO foto values (9, true, 'https://firebasestorage.googleapis.com/v0/b/upload-image-to-firebase-5aceb.appspot.com/o/images%2Fsenai.jpg?alt=media&token=3b82c7c9-3aa5-49c4-a119-86685f751d32', 300);

INSERT INTO usuario VALUES ('7878456454654', 'Celso Furtado', 'celso@terra.com.br', 'https://lh3.googleusercontent.com/a-/AOh14GiGq5wshCsLoMf1Ixe0W9V4L2zuH_c2QKNLOGbrzw');
INSERT INTO usuario VALUES ('7878456454655', 'Astolfo Pereira', 'astolfopereira333@gmail.com', 'https://lh3.googleusercontent.com/a-/AOh14Gh8hEc9p8A8Cy7Ev07v1gfo-MqoLHh69eWZzefQ');

INSERT INTO comentario VALUES(1, 'Copacabana sem dúvidas é um dos melhores destinos do Brasil. Se você for ao Rio de Janeiro este deve ser o passeio que você não deixará de fazer. Muito bom!!', '2021-05-11', 5, 100, '7878456454654');
INSERT INTO comentario VALUES(2, 'O Muser de Arte Moderna de São Paulo é incrível. Nele você pode ver obras de artistas famosos do mundo inteiro. Imperdível.', '2020-04-25', 5, 600, '7878456454655');
INSERT INTO comentario VALUES(3, 'Que lugar maravilhoso! Muita coisa pra fazer em um único lugar. Natureza, cidade, gente bonita e diversão garantida. Com certeza está em meus roteiros no futuro.', '2020-09-28', 3, 100, '7878456454655');



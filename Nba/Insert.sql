-- Insérer des données dans la table 'equipe'
INSERT INTO equipe (nom_equipe) VALUES
  ('Lakers'),
  ('Warriors'),
  ('Bulls'),
  ('Celtics'),
  ('Spurs');

-- Insérer des joueurs pour chaque équipe (5 à 10 joueurs par équipe)
INSERT INTO joueur (nom_joueur, id_equipe) VALUES
  ('LeBron James', 1),
  ('Anthony Davis', 1),
  ('Stephen Curry', 2),
  ('Klay Thompson', 2),
  ('Zach LaVine', 3),
  ('Lauri Markkanen', 3),
  ('Jayson Tatum', 4),
  ('Jaylen Brown', 4),
  ('DeMar DeRozan', 5),
  ('Keldon Johnson', 5);

-- Insérer des données dans la table 'saison'
INSERT INTO saison (date_saison) VALUES
  ('2022-2023'),
  ('2023-2024');

-- Insérer des matchs pour chaque saison et équipes
INSERT INTO match (id_saison, equipe_1, equipe_2, score_1, score_2) VALUES
  (1, 1, 2, 105, 100),
  (1, 3, 4, 98, 95),
  (1, 5, 1, 110, 115),
  (2, 2, 4, 102, 97),
  (2, 3, 5, 95, 100);

-- Insérer des résultats de matchs
INSERT INTO resultat (id_match, win, lost) VALUES
  (6, 1, 2),
  (7, 3, 4),
  (8, 1, 5),
  (9, 2, 4),
  (10, 5, 3);

-- Insérer des statistiques de matchs pour les joueurs
INSERT INTO match_statistique (id_joueur, id_match, ppm, rpm, pdpm, mpm, eff, fg, threep, lf) VALUES
  (11, 6, 28.5, 6, 8, 34, 28, 0.55, 0.4, 0.85),
  (12, 7, 22, 4, 10, 30, 24, 0.48, 0.35, 0.82),
  (13, 8, 30, 8, 5, 36, 32, 0.62, 0.42, 0.88),
  (14, 9, 18, 5, 9, 28, 20, 0.41, 0.32, 0.75),
  (15, 10, 26, 7, 7, 32, 26, 0.57, 0.38, 0.84),
  (16, 11, 20, 4, 8, 28, 18, 0.45, 0.28, 0.79),
  (17, 12, 3, 28, 6, 10, 36, 30, 0.59, 0.41),
  (18, 13, 18, 3, 7, 24, 16, 0.39, 0.27, 0.75),
  (19, 14, 5, 25, 8, 6, 31, 25, 0.52, 0.36),
  (20, 15, 2, 22, 5, 28, 20, 0.45, 0.34, 0.8);

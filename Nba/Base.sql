CREATE DATABASE nba;
\c nba

CREATE TABLE IF NOT EXISTS equipe (
    id_equipe SERIAL PRIMARY KEY,
    nom_equipe VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS joueur (
    id_joueur SERIAL PRIMARY KEY,
    nom_joueur VARCHAR(100),
    id_equipe int REFERENCES equipe(id_equipe)
);

CREATE TABLE IF NOT EXISTS saison (
    id_saison SERIAL PRIMARY KEY,
    date_saison VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS match (
    id_match SERIAL PRIMARY KEY,
    id_saison int REFERENCES saison(id_saison),
    equipe_1 int REFERENCES equipe(id_equipe),
    equipe_2 int REFERENCES equipe(id_equipe),
    score_1 int,
    score_2 int
);

CREATE TABLE IF NOT EXISTS resultat (
    id_resultat SERIAL PRIMARY KEY,
    id_match int REFERENCES match(id_match),
    win int REFERENCES equipe(id_equipe),
    lost int REFERENCES equipe(id_equipe)
);

CREATE TABLE IF NOT EXISTS match_statistique (
    id_statistique SERIAL PRIMARY KEY,
    id_joueur int REFERENCES joueur(id_joueur),
    id_match int REFERENCES match(id_match),
    ppm DOUBLE PRECISION,
    rpm DOUBLE PRECISION,
    pdpm DOUBLE PRECISION,
    mpm DOUBLE PRECISION,
    eff DOUBLE PRECISION,
    fg DOUBLE PRECISION,
    threep DOUBLE PRECISION,
    lf DOUBLE PRECISION
);

CREATE TABLE IF NOT EXISTS statistique_saison ( /*(id_saison,id_equipe)*/
    id_joueur int REFERENCES joueur(id_joueur),
    ppm DOUBLE PRECISION,
    rpm DOUBLE PRECISION,
    pdpm DOUBLE PRECISION,
    mpm DOUBLE PRECISION,
    eff DOUBLE PRECISION,
    fg DOUBLE PRECISION,
    threep DOUBLE PRECISION,
    lf DOUBLE PRECISION
);

/*alaina ny match statistique ze manana anty id_equipe ty
alaina ze manana id_saison
groupena par id_joueur de atao SUM , count(id_joueur) match joués,select count anle teo aloha*/

SELECT tab2.id_joueur,tab2.nom_joueur,COUNT(id_joueur) matchs_joues,SUM(tab2.ppm) ppms,SUM(tab2.rpm) rpms,SUM(tab2.pdpm) pdpms,SUM(tab2.mpm) mpms,SUM(tab2.eff) effs,SUM(tab2.fg) fgs,SUM(tab2.threep) threeps,SUM(tab2.lf) lfs FROM 
(SELECT tab1.id_joueur,tab1.nom_joueur,tab1.id_match,match.id_saison,tab1.ppm,tab1.rpm,tab1.pdpm,tab1.mpm,tab1.eff,tab1.fg,tab1.threep,tab1.lf FROM
(SELECT match_statistique.id_joueur,joueur.nom_joueur,joueur.id_equipe,id_match,ppm,rpm,pdpm,mpm,eff,fg,threep,lf FROM match_statistique
JOIN joueur ON (joueur.id_joueur = match_statistique.id_joueur AND joueur.id_equipe=1) ) tab1
JOIN match ON (match.id_match = tab1.id_match AND match.id_saison=1)) tab2 
GROUP BY tab2.id_joueur,tab2.nom_joueur;



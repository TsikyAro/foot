CREATE TABLE equipe(
    idEquipe    serial primary key,
    nomEquipe       varchar(30),
    competition     varchar(30),
    drapeau         varchar(30),
    buts            int,
    tirpm           double precision,
    rouge           int,
    jaune           int,
    possession      double precision,
    passeReussi     double precision,
    AerienGagne     double precision,
    note            double precision,
    type            double precision
);
INSERT INTO equipe (nomEquipe,competition,buts,tirpm,rouge,jaune,possession,passeReussi,AerienGagne,note,type) values
( 'Bayern Munich','Bundesliga',16,18.2,13 ,0,63.9,88.8,12.5,7.12,0),
('Paris Saint-Germain','Ligue 1',14,17.8,12 ,0,64.9,89.9,7.7,7.07,0),
('Bayer Leverkusen','Bundesliga',16,13.2,15 ,0,55.7,87.5,7.5,6.91,0),
('Inter','Serie A',13,14.7,8,0,59.8,86.6,17.8,6.89,0),
('Manchester City','Premier League',16,19.9,14 ,0,63.8,90.1,8.3,6.89,0),
('Real Madrid','LaLiga',16,15.5,15, 1,55.6,90.3,8,6.88,0),
('Napoli','Serie A',16,16,17 ,0,57.2,85.7,11.7,6.86,0),
('Tottenham','Premier League',15,14.3,19 ,1,62.1,88.2,9.6,6.84,0),
('Hoffenheim','Bundesliga',15,11.5,19 ,0,48.8,77.5,17.7,6.84,0),
('Atletico Madrid','LaLiga',13,10.5,14 ,1,52.0,83.5,12.2,6.83,0),
('Juventus','Serie A',9,10.8,17 ,0,48.1,83.2,13.7,6.79,0),
('Manchester United','Premier League',8,13,11 ,0,48.6,80.5,15.3,6.77,0),
('Arsenal','Premier League',9,14,8 ,1,60.5,85.9,13.5,6.75,0),
('Girona','LaLiga',16,13.4,19 ,0,54.8,85.6,13,6.75,0),
('Barcelona','LaLiga',12,14.7,17 ,1,67.8,89.2,14.3,6.74,0),
('Crystal Palace','Premier League',7,12.9,14, 0,42.0,78.0,16.4,6.74,0),
('VfB Stuttgart','Bundesliga',11,13.3,8 ,0,55.9,84.2,15.7,6.72,0),
('Chelsea','Premier League',12,12.5,25, 1,59.0,87.8,10,6.71,0),
('Everton','Premier League',9,11.2,14, 1,37.8,74.7,18.7,6.70,0),
('Monaco','Ligue 1',14,16,17, 0,54.9,83.6,11,6.70,0);



CREATE or replace VIEW GENERALE AS
SELECT
  ROW_NUMBER() OVER (ORDER BY AVG(note) DESC) AS idEquipe,
  nomequipe,
  competition,
  SUM(buts) AS buts,
  ROUND(AVG(tirpm)::numeric, 2) AS tirpm,
  SUM(rouge) AS rouge,
  SUM(jaune) AS jaune,
  round(AVG(possession)::numeric,2)AS possession,
  round(AVG(passereussi)::numeric,2) AS passereussi,
  round(AVG(aeriengagne)::numeric,2)AS aeriengagne,
  round(AVG(note)::numeric,2)AS note
FROM equipe
GROUP BY nomequipe, competition
ORDER BY note DESC;








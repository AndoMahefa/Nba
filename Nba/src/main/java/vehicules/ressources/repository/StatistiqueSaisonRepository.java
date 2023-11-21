package vehicules.ressources.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vehicules.ressources.model.StatistiqueSaison;

public interface StatistiqueSaisonRepository extends JpaRepository<StatistiqueSaison,Integer>{
    
    @Query(value="SELECT tab2.id_joueur,tab2.nom_joueur,COUNT(id_joueur) matchs_joues,SUM(tab2.ppm) ppms,SUM(tab2.rpm) rpms,SUM(tab2.pdpm) pdpms,SUM(tab2.mpm) mpms,SUM(tab2.eff) effs,SUM(tab2.fg) fgs,SUM(tab2.threep) threeps,SUM(tab2.lf) lfs FROM \n" + //
            "(SELECT tab1.id_joueur,tab1.nom_joueur,tab1.id_match,match.id_saison,tab1.ppm,tab1.rpm,tab1.pdpm,tab1.mpm,tab1.eff,tab1.fg,tab1.threep,tab1.lf FROM\n" + //
            "(SELECT match_statistique.id_joueur,joueur.nom_joueur,joueur.id_equipe,id_match,ppm,rpm,pdpm,mpm,eff,fg,threep,lf FROM match_statistique\n" + //
            "JOIN joueur ON (joueur.id_joueur = match_statistique.id_joueur AND joueur.id_equipe= :idEquipe) ) tab1\n" + //
            "JOIN match ON (match.id_match = tab1.id_match AND match.id_saison= :idSaison)) tab2 \n" + //
            "GROUP BY tab2.id_joueur,tab2.nom_joueur",nativeQuery = true)
    public List<StatistiqueSaison> getStatistiqueSaison(@Param("idEquipe") Integer idEquipe,@Param("idSaison") Integer idSaison);
}

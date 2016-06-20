package br.univali.topicos.dominio;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-19T23:25:17")
@StaticMetamodel(Disco.class)
public class Disco_ { 

    public static volatile SingularAttribute<Disco, Long> idAutor;
    public static volatile SingularAttribute<Disco, Date> dataFabricacao;
    public static volatile SingularAttribute<Disco, Long> idGenero;
    public static volatile SingularAttribute<Disco, String> titulo;
    public static volatile SingularAttribute<Disco, Long> id;
    public static volatile SingularAttribute<Disco, Long> idGravadora;
    public static volatile SingularAttribute<Disco, String> descricao;

}
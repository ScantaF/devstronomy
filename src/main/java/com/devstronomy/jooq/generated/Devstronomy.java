/*
 * This file is generated by jOOQ.
 */
package com.devstronomy.jooq.generated;


import com.devstronomy.jooq.generated.tables.Planets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Devstronomy extends SchemaImpl {

    private static final long serialVersionUID = 1678538315;

    /**
     * The reference instance of <code>devstronomy</code>
     */
    public static final Devstronomy DEVSTRONOMY = new Devstronomy();

    /**
     * The table <code>devstronomy.planets</code>.
     */
    public final Planets PLANETS = com.devstronomy.jooq.generated.tables.Planets.PLANETS;

    /**
     * No further instances allowed
     */
    private Devstronomy() {
        super("devstronomy", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Planets.PLANETS);
    }
}

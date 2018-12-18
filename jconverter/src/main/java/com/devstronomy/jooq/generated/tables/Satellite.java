/*
 * This file is generated by jOOQ.
 */
package com.devstronomy.jooq.generated.tables;


import com.devstronomy.jooq.generated.Devstronomy;
import com.devstronomy.jooq.generated.Indexes;
import com.devstronomy.jooq.generated.Keys;
import com.devstronomy.jooq.generated.tables.records.SatelliteRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Satellite extends TableImpl<SatelliteRecord> {

    private static final long serialVersionUID = -224904965;

    /**
     * The reference instance of <code>devstronomy.satellite</code>
     */
    public static final Satellite SATELLITE = new Satellite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SatelliteRecord> getRecordType() {
        return SatelliteRecord.class;
    }

    /**
     * The column <code>devstronomy.satellite.id</code>.
     */
    public final TableField<SatelliteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>devstronomy.satellite.planet_id</code>.
     */
    public final TableField<SatelliteRecord, Integer> PLANET_ID = createField("planet_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devstronomy.satellite.name</code>.
     */
    public final TableField<SatelliteRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>devstronomy.satellite.gm</code>.
     */
    public final TableField<SatelliteRecord, BigDecimal> GM = createField("gm", org.jooq.impl.SQLDataType.DECIMAL(16, 6).nullable(false), this, "");

    /**
     * The column <code>devstronomy.satellite.radius</code>.
     */
    public final TableField<SatelliteRecord, BigDecimal> RADIUS = createField("radius", org.jooq.impl.SQLDataType.DECIMAL(16, 6).nullable(false), this, "");

    /**
     * The column <code>devstronomy.satellite.density</code>.
     */
    public final TableField<SatelliteRecord, BigDecimal> DENSITY = createField("density", org.jooq.impl.SQLDataType.DECIMAL(16, 6), this, "");

    /**
     * The column <code>devstronomy.satellite.magnitude</code>.
     */
    public final TableField<SatelliteRecord, BigDecimal> MAGNITUDE = createField("magnitude", org.jooq.impl.SQLDataType.DECIMAL(16, 6), this, "");

    /**
     * The column <code>devstronomy.satellite.albedo</code>.
     */
    public final TableField<SatelliteRecord, BigDecimal> ALBEDO = createField("albedo", org.jooq.impl.SQLDataType.DECIMAL(16, 6), this, "");

    /**
     * Create a <code>devstronomy.satellite</code> table reference
     */
    public Satellite() {
        this(DSL.name("satellite"), null);
    }

    /**
     * Create an aliased <code>devstronomy.satellite</code> table reference
     */
    public Satellite(String alias) {
        this(DSL.name(alias), SATELLITE);
    }

    /**
     * Create an aliased <code>devstronomy.satellite</code> table reference
     */
    public Satellite(Name alias) {
        this(alias, SATELLITE);
    }

    private Satellite(Name alias, Table<SatelliteRecord> aliased) {
        this(alias, aliased, null);
    }

    private Satellite(Name alias, Table<SatelliteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Satellite(Table<O> child, ForeignKey<O, SatelliteRecord> key) {
        super(child, key, SATELLITE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Devstronomy.DEVSTRONOMY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SATELLITE_PLANET_ID, Indexes.SATELLITE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SatelliteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SATELLITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SatelliteRecord> getPrimaryKey() {
        return Keys.KEY_SATELLITE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SatelliteRecord>> getKeys() {
        return Arrays.<UniqueKey<SatelliteRecord>>asList(Keys.KEY_SATELLITE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SatelliteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SatelliteRecord, ?>>asList(Keys.SATELLITE_IBFK_1);
    }

    public Planet planet() {
        return new Planet(this, Keys.SATELLITE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Satellite as(String alias) {
        return new Satellite(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Satellite as(Name alias) {
        return new Satellite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Satellite rename(String name) {
        return new Satellite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Satellite rename(Name name) {
        return new Satellite(name, null);
    }
}
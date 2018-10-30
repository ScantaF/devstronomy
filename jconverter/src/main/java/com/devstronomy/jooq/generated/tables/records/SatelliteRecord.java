/*
 * This file is generated by jOOQ.
 */
package com.devstronomy.jooq.generated.tables.records;


import com.devstronomy.jooq.generated.tables.Satellite;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SatelliteRecord extends UpdatableRecordImpl<SatelliteRecord> implements Record8<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1629725879;

    /**
     * Setter for <code>devstronomy.satellite.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>devstronomy.satellite.planet_id</code>.
     */
    public void setPlanetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.planet_id</code>.
     */
    public Integer getPlanetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>devstronomy.satellite.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devstronomy.satellite.gm</code>.
     */
    public void setGm(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.gm</code>.
     */
    public BigDecimal getGm() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>devstronomy.satellite.radius</code>.
     */
    public void setRadius(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.radius</code>.
     */
    public BigDecimal getRadius() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>devstronomy.satellite.density</code>.
     */
    public void setDensity(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.density</code>.
     */
    public BigDecimal getDensity() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>devstronomy.satellite.magnitude</code>.
     */
    public void setMagnitude(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.magnitude</code>.
     */
    public BigDecimal getMagnitude() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>devstronomy.satellite.albedo</code>.
     */
    public void setAlbedo(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>devstronomy.satellite.albedo</code>.
     */
    public BigDecimal getAlbedo() {
        return (BigDecimal) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Satellite.SATELLITE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Satellite.SATELLITE.PLANET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Satellite.SATELLITE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Satellite.SATELLITE.GM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Satellite.SATELLITE.RADIUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Satellite.SATELLITE.DENSITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Satellite.SATELLITE.MAGNITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Satellite.SATELLITE.ALBEDO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getPlanetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getGm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getRadius();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getDensity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getMagnitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getAlbedo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getPlanetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getGm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getRadius();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getDensity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getMagnitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getAlbedo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value2(Integer value) {
        setPlanetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value4(BigDecimal value) {
        setGm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value5(BigDecimal value) {
        setRadius(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value6(BigDecimal value) {
        setDensity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value7(BigDecimal value) {
        setMagnitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord value8(BigDecimal value) {
        setAlbedo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SatelliteRecord values(Integer value1, Integer value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SatelliteRecord
     */
    public SatelliteRecord() {
        super(Satellite.SATELLITE);
    }

    /**
     * Create a detached, initialised SatelliteRecord
     */
    public SatelliteRecord(Integer id, Integer planetId, String name, BigDecimal gm, BigDecimal radius, BigDecimal density, BigDecimal magnitude, BigDecimal albedo) {
        super(Satellite.SATELLITE);

        set(0, id);
        set(1, planetId);
        set(2, name);
        set(3, gm);
        set(4, radius);
        set(5, density);
        set(6, magnitude);
        set(7, albedo);
    }
}

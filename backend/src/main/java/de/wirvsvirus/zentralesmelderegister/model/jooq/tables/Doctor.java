/*
 * This file is generated by jOOQ.
 */
package de.wirvsvirus.zentralesmelderegister.model.jooq.tables;


import de.wirvsvirus.zentralesmelderegister.model.jooq.Indexes;
import de.wirvsvirus.zentralesmelderegister.model.jooq.Keys;
import de.wirvsvirus.zentralesmelderegister.model.jooq.Public;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.DoctorRecord;

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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Doctor extends TableImpl<DoctorRecord> {

    private static final long serialVersionUID = -177172774;

    /**
     * The reference instance of <code>public.doctor</code>
     */
    public static final Doctor DOCTOR = new Doctor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DoctorRecord> getRecordType() {
        return DoctorRecord.class;
    }

    /**
     * The column <code>public.doctor.id</code>.
     */
    public final TableField<DoctorRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('doctor_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.doctor.name</code>.
     */
    public final TableField<DoctorRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.doctor</code> table reference
     */
    public Doctor() {
        this(DSL.name("doctor"), null);
    }

    /**
     * Create an aliased <code>public.doctor</code> table reference
     */
    public Doctor(String alias) {
        this(DSL.name(alias), DOCTOR);
    }

    /**
     * Create an aliased <code>public.doctor</code> table reference
     */
    public Doctor(Name alias) {
        this(alias, DOCTOR);
    }

    private Doctor(Name alias, Table<DoctorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Doctor(Name alias, Table<DoctorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Doctor(Table<O> child, ForeignKey<O, DoctorRecord> key) {
        super(child, key, DOCTOR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DOCTOR_ID_UINDEX, Indexes.DOCTOR_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DoctorRecord, Long> getIdentity() {
        return Keys.IDENTITY_DOCTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DoctorRecord> getPrimaryKey() {
        return Keys.DOCTOR_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DoctorRecord>> getKeys() {
        return Arrays.<UniqueKey<DoctorRecord>>asList(Keys.DOCTOR_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Doctor as(String alias) {
        return new Doctor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Doctor as(Name alias) {
        return new Doctor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Doctor rename(String name) {
        return new Doctor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Doctor rename(Name name) {
        return new Doctor(name, null);
    }
}

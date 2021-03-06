/*
 * This file is generated by jOOQ.
 */
package de.wirvsvirus.zentralesmelderegister.model.jooq;


import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.City;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Country;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Doctor;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.DoctorPatient;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.FlywaySchemaHistory;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Patient;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.State;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Test;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.TestResult;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.UserAccount;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.UserAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -792941448;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.city</code>.
     */
    public final City CITY = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.City.CITY;

    /**
     * The table <code>public.country</code>.
     */
    public final Country COUNTRY = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Country.COUNTRY;

    /**
     * The table <code>public.doctor</code>.
     */
    public final Doctor DOCTOR = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Doctor.DOCTOR;

    /**
     * The table <code>public.doctor_patient</code>.
     */
    public final DoctorPatient DOCTOR_PATIENT = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.DoctorPatient.DOCTOR_PATIENT;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.patient</code>.
     */
    public final Patient PATIENT = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Patient.PATIENT;

    /**
     * The table <code>public.state</code>.
     */
    public final State STATE = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.State.STATE;

    /**
     * The table <code>public.test</code>.
     */
    public final Test TEST = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.Test.TEST;

    /**
     * The table <code>public.test_result</code>.
     */
    public final TestResult TEST_RESULT = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.TestResult.TEST_RESULT;

    /**
     * The table <code>public.user_account</code>.
     */
    public final UserAccount USER_ACCOUNT = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.UserAccount.USER_ACCOUNT;

    /**
     * The table <code>public.user_authority</code>.
     */
    public final UserAuthority USER_AUTHORITY = de.wirvsvirus.zentralesmelderegister.model.jooq.tables.UserAuthority.USER_AUTHORITY;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CITY_ID_SEQ,
            Sequences.COUNTY_ID_SEQ,
            Sequences.DOCTOR_ID_SEQ,
            Sequences.DOCTOR_PATIENT_ID_SEQ,
            Sequences.PATIENT_ID_SEQ,
            Sequences.STATE_ID_SEQ,
            Sequences.TEST_ID_SEQ,
            Sequences.TEST_RESULT_ID_SEQ,
            Sequences.USER_ACCOUNT_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            City.CITY,
            Country.COUNTRY,
            Doctor.DOCTOR,
            DoctorPatient.DOCTOR_PATIENT,
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Patient.PATIENT,
            State.STATE,
            Test.TEST,
            TestResult.TEST_RESULT,
            UserAccount.USER_ACCOUNT,
            UserAuthority.USER_AUTHORITY);
    }
}

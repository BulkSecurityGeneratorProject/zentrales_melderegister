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
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.CityRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.CountryRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.DoctorPatientRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.DoctorRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.FlywaySchemaHistoryRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.PatientRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.StateRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.TestRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.TestResultRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.UserAccountRecord;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.UserAuthorityRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CityRecord, Long> IDENTITY_CITY = Identities0.IDENTITY_CITY;
    public static final Identity<CountryRecord, Long> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
    public static final Identity<DoctorRecord, Long> IDENTITY_DOCTOR = Identities0.IDENTITY_DOCTOR;
    public static final Identity<DoctorPatientRecord, Long> IDENTITY_DOCTOR_PATIENT = Identities0.IDENTITY_DOCTOR_PATIENT;
    public static final Identity<PatientRecord, Long> IDENTITY_PATIENT = Identities0.IDENTITY_PATIENT;
    public static final Identity<StateRecord, Long> IDENTITY_STATE = Identities0.IDENTITY_STATE;
    public static final Identity<TestRecord, Long> IDENTITY_TEST = Identities0.IDENTITY_TEST;
    public static final Identity<TestResultRecord, Long> IDENTITY_TEST_RESULT = Identities0.IDENTITY_TEST_RESULT;
    public static final Identity<UserAccountRecord, Long> IDENTITY_USER_ACCOUNT = Identities0.IDENTITY_USER_ACCOUNT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CityRecord> CITY_PK = UniqueKeys0.CITY_PK;
    public static final UniqueKey<CountryRecord> COUNTY_PK = UniqueKeys0.COUNTY_PK;
    public static final UniqueKey<DoctorRecord> DOCTOR_PK = UniqueKeys0.DOCTOR_PK;
    public static final UniqueKey<DoctorPatientRecord> DOCTOR_PATIENT_PK = UniqueKeys0.DOCTOR_PATIENT_PK;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<PatientRecord> PATIENT_PK = UniqueKeys0.PATIENT_PK;
    public static final UniqueKey<StateRecord> DISTRICT_PK = UniqueKeys0.DISTRICT_PK;
    public static final UniqueKey<TestRecord> TEST_PK = UniqueKeys0.TEST_PK;
    public static final UniqueKey<TestResultRecord> TEST_RESULT_PK = UniqueKeys0.TEST_RESULT_PK;
    public static final UniqueKey<UserAccountRecord> USER_ACCOUNT_PK = UniqueKeys0.USER_ACCOUNT_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CityRecord, CountryRecord> CITY__CITY_COUNTY_ID_FK = ForeignKeys0.CITY__CITY_COUNTY_ID_FK;
    public static final ForeignKey<CityRecord, UserAccountRecord> CITY__CITY_USER_ACCOUNT_ID_FK = ForeignKeys0.CITY__CITY_USER_ACCOUNT_ID_FK;
    public static final ForeignKey<CountryRecord, StateRecord> COUNTRY__COUNTY_STATE_ID_FK = ForeignKeys0.COUNTRY__COUNTY_STATE_ID_FK;
    public static final ForeignKey<DoctorPatientRecord, PatientRecord> DOCTOR_PATIENT__DOCTOR_PATIENT_PATIENT_ID_FK = ForeignKeys0.DOCTOR_PATIENT__DOCTOR_PATIENT_PATIENT_ID_FK;
    public static final ForeignKey<DoctorPatientRecord, DoctorRecord> DOCTOR_PATIENT__DOCTOR_PATIENT_DOCTOR_ID_FK = ForeignKeys0.DOCTOR_PATIENT__DOCTOR_PATIENT_DOCTOR_ID_FK;
    public static final ForeignKey<PatientRecord, CityRecord> PATIENT__PATIENT_CITY_ID_FK = ForeignKeys0.PATIENT__PATIENT_CITY_ID_FK;
    public static final ForeignKey<PatientRecord, UserAccountRecord> PATIENT__PATIENT_USER_ACCOUNT_ID_FK = ForeignKeys0.PATIENT__PATIENT_USER_ACCOUNT_ID_FK;
    public static final ForeignKey<TestRecord, TestResultRecord> TEST__TEST_TEST_RESULT_ID_FK = ForeignKeys0.TEST__TEST_TEST_RESULT_ID_FK;
    public static final ForeignKey<TestRecord, PatientRecord> TEST__TEST_PATIENT_ID_FK = ForeignKeys0.TEST__TEST_PATIENT_ID_FK;
    public static final ForeignKey<UserAuthorityRecord, UserAccountRecord> USER_AUTHORITY__USER_AUTHORITY___FK___USER_ACCOCUNT = ForeignKeys0.USER_AUTHORITY__USER_AUTHORITY___FK___USER_ACCOCUNT;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CityRecord, Long> IDENTITY_CITY = Internal.createIdentity(City.CITY, City.CITY.ID);
        public static Identity<CountryRecord, Long> IDENTITY_COUNTRY = Internal.createIdentity(Country.COUNTRY, Country.COUNTRY.ID);
        public static Identity<DoctorRecord, Long> IDENTITY_DOCTOR = Internal.createIdentity(Doctor.DOCTOR, Doctor.DOCTOR.ID);
        public static Identity<DoctorPatientRecord, Long> IDENTITY_DOCTOR_PATIENT = Internal.createIdentity(DoctorPatient.DOCTOR_PATIENT, DoctorPatient.DOCTOR_PATIENT.ID);
        public static Identity<PatientRecord, Long> IDENTITY_PATIENT = Internal.createIdentity(Patient.PATIENT, Patient.PATIENT.ID);
        public static Identity<StateRecord, Long> IDENTITY_STATE = Internal.createIdentity(State.STATE, State.STATE.ID);
        public static Identity<TestRecord, Long> IDENTITY_TEST = Internal.createIdentity(Test.TEST, Test.TEST.ID);
        public static Identity<TestResultRecord, Long> IDENTITY_TEST_RESULT = Internal.createIdentity(TestResult.TEST_RESULT, TestResult.TEST_RESULT.ID);
        public static Identity<UserAccountRecord, Long> IDENTITY_USER_ACCOUNT = Internal.createIdentity(UserAccount.USER_ACCOUNT, UserAccount.USER_ACCOUNT.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CityRecord> CITY_PK = Internal.createUniqueKey(City.CITY, "city_pk", City.CITY.ID);
        public static final UniqueKey<CountryRecord> COUNTY_PK = Internal.createUniqueKey(Country.COUNTRY, "county_pk", Country.COUNTRY.ID);
        public static final UniqueKey<DoctorRecord> DOCTOR_PK = Internal.createUniqueKey(Doctor.DOCTOR, "doctor_pk", Doctor.DOCTOR.ID);
        public static final UniqueKey<DoctorPatientRecord> DOCTOR_PATIENT_PK = Internal.createUniqueKey(DoctorPatient.DOCTOR_PATIENT, "doctor_patient_pk", DoctorPatient.DOCTOR_PATIENT.ID);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<PatientRecord> PATIENT_PK = Internal.createUniqueKey(Patient.PATIENT, "patient_pk", Patient.PATIENT.ID);
        public static final UniqueKey<StateRecord> DISTRICT_PK = Internal.createUniqueKey(State.STATE, "district_pk", State.STATE.ID);
        public static final UniqueKey<TestRecord> TEST_PK = Internal.createUniqueKey(Test.TEST, "test_pk", Test.TEST.ID);
        public static final UniqueKey<TestResultRecord> TEST_RESULT_PK = Internal.createUniqueKey(TestResult.TEST_RESULT, "test_result_pk", TestResult.TEST_RESULT.ID);
        public static final UniqueKey<UserAccountRecord> USER_ACCOUNT_PK = Internal.createUniqueKey(UserAccount.USER_ACCOUNT, "user_account_pk", UserAccount.USER_ACCOUNT.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CityRecord, CountryRecord> CITY__CITY_COUNTY_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.COUNTY_PK, City.CITY, "city__city_county_id_fk", City.CITY.COUNTRY_ID);
        public static final ForeignKey<CityRecord, UserAccountRecord> CITY__CITY_USER_ACCOUNT_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.USER_ACCOUNT_PK, City.CITY, "city__city_user_account_id_fk", City.CITY.USER_ACCOUNT_ID);
        public static final ForeignKey<CountryRecord, StateRecord> COUNTRY__COUNTY_STATE_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.DISTRICT_PK, Country.COUNTRY, "country__county_state_id_fk", Country.COUNTRY.STATE_ID);
        public static final ForeignKey<DoctorPatientRecord, PatientRecord> DOCTOR_PATIENT__DOCTOR_PATIENT_PATIENT_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.PATIENT_PK, DoctorPatient.DOCTOR_PATIENT, "doctor_patient__doctor_patient_patient_id_fk", DoctorPatient.DOCTOR_PATIENT.PATIENT_ID);
        public static final ForeignKey<DoctorPatientRecord, DoctorRecord> DOCTOR_PATIENT__DOCTOR_PATIENT_DOCTOR_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.DOCTOR_PK, DoctorPatient.DOCTOR_PATIENT, "doctor_patient__doctor_patient_doctor_id_fk", DoctorPatient.DOCTOR_PATIENT.DOCTOR_ID);
        public static final ForeignKey<PatientRecord, CityRecord> PATIENT__PATIENT_CITY_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.CITY_PK, Patient.PATIENT, "patient__patient_city_id_fk", Patient.PATIENT.CITY_ID);
        public static final ForeignKey<PatientRecord, UserAccountRecord> PATIENT__PATIENT_USER_ACCOUNT_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.USER_ACCOUNT_PK, Patient.PATIENT, "patient__patient_user_account_id_fk", Patient.PATIENT.USER_ACCOUNT_ID);
        public static final ForeignKey<TestRecord, TestResultRecord> TEST__TEST_TEST_RESULT_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.TEST_RESULT_PK, Test.TEST, "test__test_test_result_id_fk", Test.TEST.TEST_RESULT_ID);
        public static final ForeignKey<TestRecord, PatientRecord> TEST__TEST_PATIENT_ID_FK = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.PATIENT_PK, Test.TEST, "test__test_patient_id_fk", Test.TEST.PATIENT_ID);
        public static final ForeignKey<UserAuthorityRecord, UserAccountRecord> USER_AUTHORITY__USER_AUTHORITY___FK___USER_ACCOCUNT = Internal.createForeignKey(de.wirvsvirus.zentralesmelderegister.model.jooq.Keys.USER_ACCOUNT_PK, UserAuthority.USER_AUTHORITY, "user_authority__user_authority___fk___user_accocunt", UserAuthority.USER_AUTHORITY.USER_ACCOUNT_ID);
    }
}

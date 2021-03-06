/*
 * This file is generated by jOOQ.
 */
package de.wirvsvirus.zentralesmelderegister.model.jooq.tables;


import de.wirvsvirus.zentralesmelderegister.model.jooq.Indexes;
import de.wirvsvirus.zentralesmelderegister.model.jooq.Keys;
import de.wirvsvirus.zentralesmelderegister.model.jooq.Public;
import de.wirvsvirus.zentralesmelderegister.model.jooq.tables.records.UserAccountRecord;

import java.time.OffsetDateTime;
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
public class UserAccount extends TableImpl<UserAccountRecord> {

    private static final long serialVersionUID = -1130270847;

    /**
     * The reference instance of <code>public.user_account</code>
     */
    public static final UserAccount USER_ACCOUNT = new UserAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserAccountRecord> getRecordType() {
        return UserAccountRecord.class;
    }

    /**
     * The column <code>public.user_account.id</code>.
     */
    public final TableField<UserAccountRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_account_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.user_account.password_hash</code>.
     */
    public final TableField<UserAccountRecord, String> PASSWORD_HASH = createField("password_hash", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.user_account.mail</code>.
     */
    public final TableField<UserAccountRecord, String> MAIL = createField("mail", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.user_account.activated</code>.
     */
    public final TableField<UserAccountRecord, Boolean> ACTIVATED = createField("activated", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.user_account.activation_key</code>.
     */
    public final TableField<UserAccountRecord, String> ACTIVATION_KEY = createField("activation_key", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.user_account.reset_key</code>.
     */
    public final TableField<UserAccountRecord, String> RESET_KEY = createField("reset_key", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>public.user_account.reset_date</code>.
     */
    public final TableField<UserAccountRecord, OffsetDateTime> RESET_DATE = createField("reset_date", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>public.user_account.create_date_time</code>.
     */
    public final TableField<UserAccountRecord, OffsetDateTime> CREATE_DATE_TIME = createField("create_date_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>public.user_account.first_name</code>.
     */
    public final TableField<UserAccountRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user_account.last_name</code>.
     */
    public final TableField<UserAccountRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.user_account</code> table reference
     */
    public UserAccount() {
        this(DSL.name("user_account"), null);
    }

    /**
     * Create an aliased <code>public.user_account</code> table reference
     */
    public UserAccount(String alias) {
        this(DSL.name(alias), USER_ACCOUNT);
    }

    /**
     * Create an aliased <code>public.user_account</code> table reference
     */
    public UserAccount(Name alias) {
        this(alias, USER_ACCOUNT);
    }

    private UserAccount(Name alias, Table<UserAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserAccount(Name alias, Table<UserAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserAccount(Table<O> child, ForeignKey<O, UserAccountRecord> key) {
        super(child, key, USER_ACCOUNT);
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
        return Arrays.<Index>asList(Indexes.USER_ACCOUNT_ID_UINDEX, Indexes.USER_ACCOUNT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserAccountRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserAccountRecord> getPrimaryKey() {
        return Keys.USER_ACCOUNT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<UserAccountRecord>>asList(Keys.USER_ACCOUNT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAccount as(String alias) {
        return new UserAccount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserAccount as(Name alias) {
        return new UserAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserAccount rename(String name) {
        return new UserAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserAccount rename(Name name) {
        return new UserAccount(name, null);
    }
}

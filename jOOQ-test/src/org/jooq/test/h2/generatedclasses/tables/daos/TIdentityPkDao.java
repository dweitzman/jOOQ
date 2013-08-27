/*
 * Copyright (c) 2013 by Data Geekery GmbH
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU Affero General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or (at your 
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for 
 * more details.
 *
 * You should have received a copy of the GNU Affero General Public License 
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityPkDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk, java.lang.Integer> {

	/**
	 * Create a new TIdentityPkDao without any configuration
	 */
	public TIdentityPkDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk.class);
	}

	/**
	 * Create a new TIdentityPkDao with an attached configuration
	 */
	public TIdentityPkDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TIdentityPk.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.TIdentityPk.ID, value);
	}

	/**
	 * Fetch records that have <code>VAL IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TIdentityPk> fetchByVal(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TIdentityPk.VAL, values);
	}
}

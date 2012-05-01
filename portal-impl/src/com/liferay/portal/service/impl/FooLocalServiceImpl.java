/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the foo local service.
 *
 * @author Brian Wing Shun Chan
 * @author Jorge Ferrer
 * @author Julio Camarero
 * @author Hugo Huijser
 * @author Juan Fernández
 */
public class FooLocalServiceImpl {

	/**
	 * Add foo
	 *
	 * This method handles the creation and bookkeeping of the foo including its resources,
	 * metadata, and internal data structures. It is not necessary to make a subsequent call
	 * to addFooResources(long, String).
	 *
	 * @param  userId creator/owner primary key
	 * @param  parentFooId parent primary key
	 * @param  name
	 * @param  type type
	 * @param  recursable should the permissions of the foo be
	 *         inherited by its sub-foos
	 * @param  regionId the primary key of the foo's region
	 * @param  countryId the primary key of the foo's country
	 * @param  statusId the workflow status
	 * @param  comments the comments about the foo
	 * @param  site whether the foo is to be associated with a main
	 *         site
	 * @param  serviceContext the foo's service context ... can be null. Can set asset category IDs, asset tag names,
	 *         and expando bridge attributes for the foo.
	 * @return foo
	 * @throws PortalException a creator or parent foo with the
	 *         primary key can't be found or if the foo's
	 *         information is invalid
	 * @throws SystemException
	 */
	public String addFoo(
			long userId, long parentFooId, String name, String type,
			boolean recursable, long regionId, long countryId, int statusId,
			String comments, boolean site, ServiceContext serviceContext)
		throws PortalException, SystemException {

		//etc.

		return "";
	}

	/**
	 * Adds a resource for each type of permission available on the
	 * foo.
	 *
	 * @param  userId the primary key of the creator/owner of the foo.
	 * @param  foo the foo.
	 * @throws PortalException if a portal exception occurred.
	 * @throws SystemException if a system exception occurred.
	 */
	public void addFooResources(long userId, String foo)
		throws PortalException, SystemException {

		// etc.
	}

	/**
	 * Removes the foo. The foo's associated resources and
	 * assets are also deleted.
	 *
	 * @param  fooId the primary key of the foo
	 * @return
	 * @throws PortalException if a foo with the primary key could not
	 *         be found, if the foo had a workflow in approved status,
	 *         or if the foo was a parent foo
	 * @throws SystemException if a system exception occurred
	 */
	public String deleteFoo(long fooId)
		throws PortalException, SystemException {

		// etc.

		return "";
	}

	/**
	 * Gets the foo with the name.
	 *
	 * @param  companyId the primary key of the foo's company
	 * @param  name a name
	 * @return a foo.
	 * @throws PortalException if the foo with the name could not be
	 *         found
	 * @throws SystemException if a system exception occurred
	 */
	public String getFoo(long companyId, String name)
		throws PortalException, SystemException {

		//etc.

		return "";
	}

	/**
	 * Gets foos belonging to the parent foo.
	 *
	 * @param  companyId the primary key of the foo's company
	 * @param  parentFooId the primary key of the foo's parent
	 *         foo
	 * @return foos.
	 * @throws SystemException if a system exception occurred
	 */
	public List<String> getFoos(
			long companyId, long parentFooId)
		throws SystemException {

		//etc.

		return new ArrayList<String>();
	}

	/**
	 * gets foos belonging to the parent foo.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end -
	 * start</code> instances. <code>start</code> and <code>end</code> are not
	 * primary keys, they are indexes in the result set. Thus, <code>0</code>
	 * refers to the first result in the set. Setting both <code>start</code>
	 * and <code>end</code> to {@link
	 * QueryUtil#ALL_POS} will return the full
	 * result set.
	 * </p>
	 *
	 * @param  companyId the primary key of the foo's company
	 * @param  parentFooId the primary key of the foo's parent
	 *         foo
	 * @param  start the lower bound of the range of foos to return
	 * @param  end the upper bound of the range of foos to return (not
	 *         inclusive)
	 * @return foos belonging to the parent foo.
	 * @throws SystemException if a system exception occurred
	 */
	public List<String> getFoos(
			long companyId, long parentFooId, int start, int end)
		throws SystemException {

		//etc.

		return new ArrayList<String>();
	}

	/**
	 * Counts foos belonging to the parent foo.
	 *
	 * @param  companyId the primary key of the foo's company
	 * @param  parentFooId the primary key of the foo's parent
	 *         foo
	 * @return the number
	 * @throws SystemException if a system exception occurred
	 */
	public int getFoosCount(long companyId, long parentFooId)
		throws SystemException {

		//etc.

		return 0;
	}

	/**
	 * Gives back true if the password policy has been assigned to the
	 * foo.
	 *
	 * @param  passwordPolicyId the primary key of the password policy
	 * @param  fooId the primary key of the foo
	 * @return whether the password policy has been assigned to the
	 *         foo
	 * @throws SystemException if a system exception occurred
	 */
	public boolean hasPasswordPolicyFoo(
			long passwordPolicyId, long fooId)
		throws SystemException {

		//etc.

		return true;
	}

	/**
	 * True if the user is a member of the foo,
	 * optionally focusing on sub-foos or the specified foo.
	 * This method is usually called to determine if the user has view access to
	 * a resource belonging to the foo.
	 *
	 * <p>
	 *
	 * <ol><li>If <code>inheritSubfoos=<code>false</code></code>:
	 * the method checks whether the user belongs to the foo specified
	 * by <code>fooId</code>. The parameter
	 * <code>includeSpecifiedFoo</code> is ignored.</li>
	 * <li> The parameter <code>includeSpecifiedFoo</code> is
	 * ignored unless <code>inheritSubfoos</code> is also
	 * <code>true</code>.</li>
	 * <li>If <code>inheritSubfoos=<code>true</code></code> and
	 * <code>includeSpecifiedFoo=<code>false</code></code>: the method
	 * checks whether the user belongs to one of the child foos of the one
	 * specified by <code>fooId</code>.</li>
	 * <li>If <code>inheritSubfoos=<code>true</code></code> and
	 * <code>includeSpecifiedFoo=<code>true</code></code>: the method
	 * checks whether the user belongs to the foo specified by
	 * <code>fooId</code> or any of its child foos.</li></ol>
	 *
	 * <p>
	 *
	 * @param  userId the primary key of the foo's user
	 * @param  fooId the primary key of the foo
	 * @param  inheritSubfoos if <code>true</code> sub-foos are considered in the
	 * determination
	 * @param  includeSpecifiedFoo if <code>true</code> the
	 *         foo specified by <code>fooId</code> is
	 *         considered in the determination
	 * @return <code>true</code> if the user has access to the foo;
	 *         <code>false</code> otherwise
	 * @throws PortalException if a foo with the primary key could not
	 *         be found
	 * @throws SystemException if a system exception occurred
	 */
	public boolean hasUserFoo(
			long userId, long fooId, boolean inheritSubfoos,
			boolean includeSpecifiedFoo)
		throws PortalException, SystemException {

		return false;
	}
}
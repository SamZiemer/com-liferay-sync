/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.sync.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SyncDLObject service. Represents a row in the &quot;SyncDLObject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.sync.model.impl.SyncDLObjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.sync.model.impl.SyncDLObjectImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SyncDLObject
 * @see com.liferay.sync.model.impl.SyncDLObjectImpl
 * @see com.liferay.sync.model.impl.SyncDLObjectModelImpl
 * @generated
 */
@ProviderType
public interface SyncDLObjectModel extends BaseModel<SyncDLObject>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sync dl object model instance should use the {@link SyncDLObject} interface instead.
	 */

	/**
	 * Returns the primary key of this sync dl object.
	 *
	 * @return the primary key of this sync dl object
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sync dl object.
	 *
	 * @param primaryKey the primary key of this sync dl object
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sync dl object ID of this sync dl object.
	 *
	 * @return the sync dl object ID of this sync dl object
	 */
	public long getSyncDLObjectId();

	/**
	 * Sets the sync dl object ID of this sync dl object.
	 *
	 * @param syncDLObjectId the sync dl object ID of this sync dl object
	 */
	public void setSyncDLObjectId(long syncDLObjectId);

	/**
	 * Returns the company ID of this sync dl object.
	 *
	 * @return the company ID of this sync dl object
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sync dl object.
	 *
	 * @param companyId the company ID of this sync dl object
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sync dl object.
	 *
	 * @return the user ID of this sync dl object
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this sync dl object.
	 *
	 * @param userId the user ID of this sync dl object
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sync dl object.
	 *
	 * @return the user uuid of this sync dl object
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sync dl object.
	 *
	 * @param userUuid the user uuid of this sync dl object
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sync dl object.
	 *
	 * @return the user name of this sync dl object
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this sync dl object.
	 *
	 * @param userName the user name of this sync dl object
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create time of this sync dl object.
	 *
	 * @return the create time of this sync dl object
	 */
	public long getCreateTime();

	/**
	 * Sets the create time of this sync dl object.
	 *
	 * @param createTime the create time of this sync dl object
	 */
	public void setCreateTime(long createTime);

	/**
	 * Returns the modified time of this sync dl object.
	 *
	 * @return the modified time of this sync dl object
	 */
	public long getModifiedTime();

	/**
	 * Sets the modified time of this sync dl object.
	 *
	 * @param modifiedTime the modified time of this sync dl object
	 */
	public void setModifiedTime(long modifiedTime);

	/**
	 * Returns the repository ID of this sync dl object.
	 *
	 * @return the repository ID of this sync dl object
	 */
	public long getRepositoryId();

	/**
	 * Sets the repository ID of this sync dl object.
	 *
	 * @param repositoryId the repository ID of this sync dl object
	 */
	public void setRepositoryId(long repositoryId);

	/**
	 * Returns the parent folder ID of this sync dl object.
	 *
	 * @return the parent folder ID of this sync dl object
	 */
	public long getParentFolderId();

	/**
	 * Sets the parent folder ID of this sync dl object.
	 *
	 * @param parentFolderId the parent folder ID of this sync dl object
	 */
	public void setParentFolderId(long parentFolderId);

	/**
	 * Returns the tree path of this sync dl object.
	 *
	 * @return the tree path of this sync dl object
	 */
	@AutoEscape
	public String getTreePath();

	/**
	 * Sets the tree path of this sync dl object.
	 *
	 * @param treePath the tree path of this sync dl object
	 */
	public void setTreePath(String treePath);

	/**
	 * Returns the name of this sync dl object.
	 *
	 * @return the name of this sync dl object
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this sync dl object.
	 *
	 * @param name the name of this sync dl object
	 */
	public void setName(String name);

	/**
	 * Returns the extension of this sync dl object.
	 *
	 * @return the extension of this sync dl object
	 */
	@AutoEscape
	public String getExtension();

	/**
	 * Sets the extension of this sync dl object.
	 *
	 * @param extension the extension of this sync dl object
	 */
	public void setExtension(String extension);

	/**
	 * Returns the mime type of this sync dl object.
	 *
	 * @return the mime type of this sync dl object
	 */
	@AutoEscape
	public String getMimeType();

	/**
	 * Sets the mime type of this sync dl object.
	 *
	 * @param mimeType the mime type of this sync dl object
	 */
	public void setMimeType(String mimeType);

	/**
	 * Returns the description of this sync dl object.
	 *
	 * @return the description of this sync dl object
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this sync dl object.
	 *
	 * @param description the description of this sync dl object
	 */
	public void setDescription(String description);

	/**
	 * Returns the change log of this sync dl object.
	 *
	 * @return the change log of this sync dl object
	 */
	@AutoEscape
	public String getChangeLog();

	/**
	 * Sets the change log of this sync dl object.
	 *
	 * @param changeLog the change log of this sync dl object
	 */
	public void setChangeLog(String changeLog);

	/**
	 * Returns the extra settings of this sync dl object.
	 *
	 * @return the extra settings of this sync dl object
	 */
	@AutoEscape
	public String getExtraSettings();

	/**
	 * Sets the extra settings of this sync dl object.
	 *
	 * @param extraSettings the extra settings of this sync dl object
	 */
	public void setExtraSettings(String extraSettings);

	/**
	 * Returns the version of this sync dl object.
	 *
	 * @return the version of this sync dl object
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this sync dl object.
	 *
	 * @param version the version of this sync dl object
	 */
	public void setVersion(String version);

	/**
	 * Returns the version ID of this sync dl object.
	 *
	 * @return the version ID of this sync dl object
	 */
	public long getVersionId();

	/**
	 * Sets the version ID of this sync dl object.
	 *
	 * @param versionId the version ID of this sync dl object
	 */
	public void setVersionId(long versionId);

	/**
	 * Returns the size of this sync dl object.
	 *
	 * @return the size of this sync dl object
	 */
	public long getSize();

	/**
	 * Sets the size of this sync dl object.
	 *
	 * @param size the size of this sync dl object
	 */
	public void setSize(long size);

	/**
	 * Returns the checksum of this sync dl object.
	 *
	 * @return the checksum of this sync dl object
	 */
	@AutoEscape
	public String getChecksum();

	/**
	 * Sets the checksum of this sync dl object.
	 *
	 * @param checksum the checksum of this sync dl object
	 */
	public void setChecksum(String checksum);

	/**
	 * Returns the event of this sync dl object.
	 *
	 * @return the event of this sync dl object
	 */
	@AutoEscape
	public String getEvent();

	/**
	 * Sets the event of this sync dl object.
	 *
	 * @param event the event of this sync dl object
	 */
	public void setEvent(String event);

	/**
	 * Returns the lan token key of this sync dl object.
	 *
	 * @return the lan token key of this sync dl object
	 */
	@AutoEscape
	public String getLanTokenKey();

	/**
	 * Sets the lan token key of this sync dl object.
	 *
	 * @param lanTokenKey the lan token key of this sync dl object
	 */
	public void setLanTokenKey(String lanTokenKey);

	/**
	 * Returns the last permission change date of this sync dl object.
	 *
	 * @return the last permission change date of this sync dl object
	 */
	public Date getLastPermissionChangeDate();

	/**
	 * Sets the last permission change date of this sync dl object.
	 *
	 * @param lastPermissionChangeDate the last permission change date of this sync dl object
	 */
	public void setLastPermissionChangeDate(Date lastPermissionChangeDate);

	/**
	 * Returns the lock expiration date of this sync dl object.
	 *
	 * @return the lock expiration date of this sync dl object
	 */
	public Date getLockExpirationDate();

	/**
	 * Sets the lock expiration date of this sync dl object.
	 *
	 * @param lockExpirationDate the lock expiration date of this sync dl object
	 */
	public void setLockExpirationDate(Date lockExpirationDate);

	/**
	 * Returns the lock user ID of this sync dl object.
	 *
	 * @return the lock user ID of this sync dl object
	 */
	public long getLockUserId();

	/**
	 * Sets the lock user ID of this sync dl object.
	 *
	 * @param lockUserId the lock user ID of this sync dl object
	 */
	public void setLockUserId(long lockUserId);

	/**
	 * Returns the lock user uuid of this sync dl object.
	 *
	 * @return the lock user uuid of this sync dl object
	 */
	public String getLockUserUuid();

	/**
	 * Sets the lock user uuid of this sync dl object.
	 *
	 * @param lockUserUuid the lock user uuid of this sync dl object
	 */
	public void setLockUserUuid(String lockUserUuid);

	/**
	 * Returns the lock user name of this sync dl object.
	 *
	 * @return the lock user name of this sync dl object
	 */
	@AutoEscape
	public String getLockUserName();

	/**
	 * Sets the lock user name of this sync dl object.
	 *
	 * @param lockUserName the lock user name of this sync dl object
	 */
	public void setLockUserName(String lockUserName);

	/**
	 * Returns the type of this sync dl object.
	 *
	 * @return the type of this sync dl object
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this sync dl object.
	 *
	 * @param type the type of this sync dl object
	 */
	public void setType(String type);

	/**
	 * Returns the type pk of this sync dl object.
	 *
	 * @return the type pk of this sync dl object
	 */
	public long getTypePK();

	/**
	 * Sets the type pk of this sync dl object.
	 *
	 * @param typePK the type pk of this sync dl object
	 */
	public void setTypePK(long typePK);

	/**
	 * Returns the type uuid of this sync dl object.
	 *
	 * @return the type uuid of this sync dl object
	 */
	@AutoEscape
	public String getTypeUuid();

	/**
	 * Sets the type uuid of this sync dl object.
	 *
	 * @param typeUuid the type uuid of this sync dl object
	 */
	public void setTypeUuid(String typeUuid);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(SyncDLObject syncDLObject);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SyncDLObject> toCacheModel();

	@Override
	public SyncDLObject toEscapedModel();

	@Override
	public SyncDLObject toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
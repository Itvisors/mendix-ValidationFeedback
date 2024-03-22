// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class SynchronizationError
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject synchronizationErrorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.SynchronizationError";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Reason("Reason"),
		ObjectId("ObjectId"),
		ObjectType("ObjectType"),
		ObjectContent("ObjectContent");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SynchronizationError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SynchronizationError(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject synchronizationErrorMendixObject)
	{
		if (synchronizationErrorMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, synchronizationErrorMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.synchronizationErrorMendixObject = synchronizationErrorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SynchronizationError.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.SynchronizationError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.SynchronizationError.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static system.proxies.SynchronizationError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.SynchronizationError(context, mendixObject);
	}

	public static system.proxies.SynchronizationError load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.SynchronizationError.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.SynchronizationError> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> system.proxies.SynchronizationError.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @return value of ObjectId
	 */
	public final java.lang.String getObjectId()
	{
		return getObjectId(getContext());
	}

	/**
	 * @param context
	 * @return value of ObjectId
	 */
	public final java.lang.String getObjectId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ObjectId.toString());
	}

	/**
	 * Set value of ObjectId
	 * @param objectid
	 */
	public final void setObjectId(java.lang.String objectid)
	{
		setObjectId(getContext(), objectid);
	}

	/**
	 * Set value of ObjectId
	 * @param context
	 * @param objectid
	 */
	public final void setObjectId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String objectid)
	{
		getMendixObject().setValue(context, MemberNames.ObjectId.toString(), objectid);
	}

	/**
	 * @return value of ObjectType
	 */
	public final java.lang.String getObjectType()
	{
		return getObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of ObjectType
	 */
	public final java.lang.String getObjectType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ObjectType.toString());
	}

	/**
	 * Set value of ObjectType
	 * @param objecttype
	 */
	public final void setObjectType(java.lang.String objecttype)
	{
		setObjectType(getContext(), objecttype);
	}

	/**
	 * Set value of ObjectType
	 * @param context
	 * @param objecttype
	 */
	public final void setObjectType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String objecttype)
	{
		getMendixObject().setValue(context, MemberNames.ObjectType.toString(), objecttype);
	}

	/**
	 * @return value of ObjectContent
	 */
	public final java.lang.String getObjectContent()
	{
		return getObjectContent(getContext());
	}

	/**
	 * @param context
	 * @return value of ObjectContent
	 */
	public final java.lang.String getObjectContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ObjectContent.toString());
	}

	/**
	 * Set value of ObjectContent
	 * @param objectcontent
	 */
	public final void setObjectContent(java.lang.String objectcontent)
	{
		setObjectContent(getContext(), objectcontent);
	}

	/**
	 * Set value of ObjectContent
	 * @param context
	 * @param objectcontent
	 */
	public final void setObjectContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String objectcontent)
	{
		getMendixObject().setValue(context, MemberNames.ObjectContent.toString(), objectcontent);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return synchronizationErrorMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.SynchronizationError that = (system.proxies.SynchronizationError) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

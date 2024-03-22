// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendixsso.proxies;

public class MendixSSOConfigurationView
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mendixSSOConfigurationViewMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MendixSSO.MendixSSOConfigurationView";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SSOEnabled("SSOEnabled"),
		SilentAuthentication("SilentAuthentication"),
		DefaultRequestScopes("DefaultRequestScopes"),
		EnvironmentUUID("EnvironmentUUID"),
		EnvironmentPassword("EnvironmentPassword"),
		OpenIdConnectProvider("OpenIdConnectProvider"),
		RolesLocation("RolesLocation"),
		SignupHint("SignupHint");

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

	public MendixSSOConfigurationView(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected MendixSSOConfigurationView(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixSSOConfigurationViewMendixObject)
	{
		if (mendixSSOConfigurationViewMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, mendixSSOConfigurationViewMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.mendixSSOConfigurationViewMendixObject = mendixSSOConfigurationViewMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MendixSSOConfigurationView.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mendixsso.proxies.MendixSSOConfigurationView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendixsso.proxies.MendixSSOConfigurationView.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static mendixsso.proxies.MendixSSOConfigurationView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendixsso.proxies.MendixSSOConfigurationView(context, mendixObject);
	}

	public static mendixsso.proxies.MendixSSOConfigurationView load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendixsso.proxies.MendixSSOConfigurationView.initialize(context, mendixObject);
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
	 * @return value of SSOEnabled
	 */
	public final java.lang.Boolean getSSOEnabled()
	{
		return getSSOEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of SSOEnabled
	 */
	public final java.lang.Boolean getSSOEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SSOEnabled.toString());
	}

	/**
	 * Set value of SSOEnabled
	 * @param ssoenabled
	 */
	public final void setSSOEnabled(java.lang.Boolean ssoenabled)
	{
		setSSOEnabled(getContext(), ssoenabled);
	}

	/**
	 * Set value of SSOEnabled
	 * @param context
	 * @param ssoenabled
	 */
	public final void setSSOEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ssoenabled)
	{
		getMendixObject().setValue(context, MemberNames.SSOEnabled.toString(), ssoenabled);
	}

	/**
	 * @return value of SilentAuthentication
	 */
	public final java.lang.Boolean getSilentAuthentication()
	{
		return getSilentAuthentication(getContext());
	}

	/**
	 * @param context
	 * @return value of SilentAuthentication
	 */
	public final java.lang.Boolean getSilentAuthentication(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SilentAuthentication.toString());
	}

	/**
	 * Set value of SilentAuthentication
	 * @param silentauthentication
	 */
	public final void setSilentAuthentication(java.lang.Boolean silentauthentication)
	{
		setSilentAuthentication(getContext(), silentauthentication);
	}

	/**
	 * Set value of SilentAuthentication
	 * @param context
	 * @param silentauthentication
	 */
	public final void setSilentAuthentication(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean silentauthentication)
	{
		getMendixObject().setValue(context, MemberNames.SilentAuthentication.toString(), silentauthentication);
	}

	/**
	 * @return value of DefaultRequestScopes
	 */
	public final java.lang.String getDefaultRequestScopes()
	{
		return getDefaultRequestScopes(getContext());
	}

	/**
	 * @param context
	 * @return value of DefaultRequestScopes
	 */
	public final java.lang.String getDefaultRequestScopes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DefaultRequestScopes.toString());
	}

	/**
	 * Set value of DefaultRequestScopes
	 * @param defaultrequestscopes
	 */
	public final void setDefaultRequestScopes(java.lang.String defaultrequestscopes)
	{
		setDefaultRequestScopes(getContext(), defaultrequestscopes);
	}

	/**
	 * Set value of DefaultRequestScopes
	 * @param context
	 * @param defaultrequestscopes
	 */
	public final void setDefaultRequestScopes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String defaultrequestscopes)
	{
		getMendixObject().setValue(context, MemberNames.DefaultRequestScopes.toString(), defaultrequestscopes);
	}

	/**
	 * @return value of EnvironmentUUID
	 */
	public final java.lang.String getEnvironmentUUID()
	{
		return getEnvironmentUUID(getContext());
	}

	/**
	 * @param context
	 * @return value of EnvironmentUUID
	 */
	public final java.lang.String getEnvironmentUUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EnvironmentUUID.toString());
	}

	/**
	 * Set value of EnvironmentUUID
	 * @param environmentuuid
	 */
	public final void setEnvironmentUUID(java.lang.String environmentuuid)
	{
		setEnvironmentUUID(getContext(), environmentuuid);
	}

	/**
	 * Set value of EnvironmentUUID
	 * @param context
	 * @param environmentuuid
	 */
	public final void setEnvironmentUUID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String environmentuuid)
	{
		getMendixObject().setValue(context, MemberNames.EnvironmentUUID.toString(), environmentuuid);
	}

	/**
	 * @return value of EnvironmentPassword
	 */
	public final java.lang.String getEnvironmentPassword()
	{
		return getEnvironmentPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of EnvironmentPassword
	 */
	public final java.lang.String getEnvironmentPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EnvironmentPassword.toString());
	}

	/**
	 * Set value of EnvironmentPassword
	 * @param environmentpassword
	 */
	public final void setEnvironmentPassword(java.lang.String environmentpassword)
	{
		setEnvironmentPassword(getContext(), environmentpassword);
	}

	/**
	 * Set value of EnvironmentPassword
	 * @param context
	 * @param environmentpassword
	 */
	public final void setEnvironmentPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String environmentpassword)
	{
		getMendixObject().setValue(context, MemberNames.EnvironmentPassword.toString(), environmentpassword);
	}

	/**
	 * @return value of OpenIdConnectProvider
	 */
	public final java.lang.String getOpenIdConnectProvider()
	{
		return getOpenIdConnectProvider(getContext());
	}

	/**
	 * @param context
	 * @return value of OpenIdConnectProvider
	 */
	public final java.lang.String getOpenIdConnectProvider(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OpenIdConnectProvider.toString());
	}

	/**
	 * Set value of OpenIdConnectProvider
	 * @param openidconnectprovider
	 */
	public final void setOpenIdConnectProvider(java.lang.String openidconnectprovider)
	{
		setOpenIdConnectProvider(getContext(), openidconnectprovider);
	}

	/**
	 * Set value of OpenIdConnectProvider
	 * @param context
	 * @param openidconnectprovider
	 */
	public final void setOpenIdConnectProvider(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String openidconnectprovider)
	{
		getMendixObject().setValue(context, MemberNames.OpenIdConnectProvider.toString(), openidconnectprovider);
	}

	/**
	 * @return value of RolesLocation
	 */
	public final java.lang.String getRolesLocation()
	{
		return getRolesLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of RolesLocation
	 */
	public final java.lang.String getRolesLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RolesLocation.toString());
	}

	/**
	 * Set value of RolesLocation
	 * @param roleslocation
	 */
	public final void setRolesLocation(java.lang.String roleslocation)
	{
		setRolesLocation(getContext(), roleslocation);
	}

	/**
	 * Set value of RolesLocation
	 * @param context
	 * @param roleslocation
	 */
	public final void setRolesLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String roleslocation)
	{
		getMendixObject().setValue(context, MemberNames.RolesLocation.toString(), roleslocation);
	}

	/**
	 * @return value of SignupHint
	 */
	public final java.lang.String getSignupHint()
	{
		return getSignupHint(getContext());
	}

	/**
	 * @param context
	 * @return value of SignupHint
	 */
	public final java.lang.String getSignupHint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SignupHint.toString());
	}

	/**
	 * Set value of SignupHint
	 * @param signuphint
	 */
	public final void setSignupHint(java.lang.String signuphint)
	{
		setSignupHint(getContext(), signuphint);
	}

	/**
	 * Set value of SignupHint
	 * @param context
	 * @param signuphint
	 */
	public final void setSignupHint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String signuphint)
	{
		getMendixObject().setValue(context, MemberNames.SignupHint.toString(), signuphint);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mendixSSOConfigurationViewMendixObject;
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
			final mendixsso.proxies.MendixSSOConfigurationView that = (mendixsso.proxies.MendixSSOConfigurationView) obj;
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

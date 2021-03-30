// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Address
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject addressMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Address";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Address("Address"),
		Postcode("Postcode"),
		City("City"),
		County("County"),
		Country("Country");

		private java.lang.String metaName;

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

	public Address(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Address"));
	}

	protected Address(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject addressMendixObject)
	{
		if (addressMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Address", addressMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Address");

		this.addressMendixObject = addressMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Address.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Address initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Address.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Address initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Address(context, mendixObject);
	}

	public static myfirstmodule.proxies.Address load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Address.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Address> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Address> result = new java.util.ArrayList<myfirstmodule.proxies.Address>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Address" + xpathConstraint))
			result.add(myfirstmodule.proxies.Address.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
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
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @return value of Postcode
	 */
	public final java.lang.String getPostcode()
	{
		return getPostcode(getContext());
	}

	/**
	 * @param context
	 * @return value of Postcode
	 */
	public final java.lang.String getPostcode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Postcode.toString());
	}

	/**
	 * Set value of Postcode
	 * @param postcode
	 */
	public final void setPostcode(java.lang.String postcode)
	{
		setPostcode(getContext(), postcode);
	}

	/**
	 * Set value of Postcode
	 * @param context
	 * @param postcode
	 */
	public final void setPostcode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String postcode)
	{
		getMendixObject().setValue(context, MemberNames.Postcode.toString(), postcode);
	}

	/**
	 * @return value of City
	 */
	public final java.lang.String getCity()
	{
		return getCity(getContext());
	}

	/**
	 * @param context
	 * @return value of City
	 */
	public final java.lang.String getCity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.City.toString());
	}

	/**
	 * Set value of City
	 * @param city
	 */
	public final void setCity(java.lang.String city)
	{
		setCity(getContext(), city);
	}

	/**
	 * Set value of City
	 * @param context
	 * @param city
	 */
	public final void setCity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String city)
	{
		getMendixObject().setValue(context, MemberNames.City.toString(), city);
	}

	/**
	 * @return value of County
	 */
	public final java.lang.String getCounty()
	{
		return getCounty(getContext());
	}

	/**
	 * @param context
	 * @return value of County
	 */
	public final java.lang.String getCounty(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.County.toString());
	}

	/**
	 * Set value of County
	 * @param county
	 */
	public final void setCounty(java.lang.String county)
	{
		setCounty(getContext(), county);
	}

	/**
	 * Set value of County
	 * @param context
	 * @param county
	 */
	public final void setCounty(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String county)
	{
		getMendixObject().setValue(context, MemberNames.County.toString(), county);
	}

	/**
	 * @return value of Country
	 */
	public final java.lang.String getCountry()
	{
		return getCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of Country
	 */
	public final java.lang.String getCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Country.toString());
	}

	/**
	 * Set value of Country
	 * @param country
	 */
	public final void setCountry(java.lang.String country)
	{
		setCountry(getContext(), country);
	}

	/**
	 * Set value of Country
	 * @param context
	 * @param country
	 */
	public final void setCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.Country.toString(), country);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return addressMendixObject;
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
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Address that = (myfirstmodule.proxies.Address) obj;
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
		return "MyFirstModule.Address";
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
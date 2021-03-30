// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package postcodelookup.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the PostcodeLookup module

	public static java.lang.String getAPIKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("PostcodeLookup.APIKey");
	}

	public static java.lang.Long getCacheExpirationInDays()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("PostcodeLookup.CacheExpirationInDays");
	}

	public static java.lang.String getDefaultCountryISOA2()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("PostcodeLookup.DefaultCountryISOA2");
	}
}
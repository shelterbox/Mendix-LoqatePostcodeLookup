// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package loqatepostcodelookup.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the LoqatePostcodeLookup module

	public static java.lang.String getAPIKey()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("LoqatePostcodeLookup.APIKey");
	}

	public static java.lang.Long getCacheExpirationInDays()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("LoqatePostcodeLookup.CacheExpirationInDays");
	}

	public static java.lang.Long getFindLimit()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("LoqatePostcodeLookup.FindLimit");
	}
}
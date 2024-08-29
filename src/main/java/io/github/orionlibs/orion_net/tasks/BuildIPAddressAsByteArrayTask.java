package io.github.orionlibs.orion_net.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_assert.InvalidArgumentException;

public class BuildIPAddressAsByteArrayTask
{
    public static byte[] run(String IPAddress)
    {
        Assert.notEmpty(IPAddress, "IPAddress cannot be null/empty.");
        byte[] IPAddressTemp = null;
        String[] IPAddressTokens = IPAddress.split("\\.");
        if(IPAddressTokens != null && IPAddressTokens.length == 4)
        {
            IPAddressTemp = new byte[4];
            short a1 = Short.parseShort(IPAddressTokens[0]);
            short a2 = Short.parseShort(IPAddressTokens[1]);
            short a3 = Short.parseShort(IPAddressTokens[2]);
            short a4 = Short.parseShort(IPAddressTokens[3]);
            ConvertStringToByteWithoutOverflowingTask.run(IPAddressTemp, a1, 0);
            ConvertStringToByteWithoutOverflowingTask.run(IPAddressTemp, a2, 1);
            ConvertStringToByteWithoutOverflowingTask.run(IPAddressTemp, a3, 2);
            ConvertStringToByteWithoutOverflowingTask.run(IPAddressTemp, a4, 3);
        }
        else
        {
            throw new InvalidArgumentException("'%s' is not a valid IP address.", IPAddress);
        }
        return IPAddressTemp;
    }
}
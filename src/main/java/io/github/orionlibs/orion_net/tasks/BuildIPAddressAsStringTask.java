package io.github.orionlibs.orion_net.tasks;

import java.util.Optional;

public class BuildIPAddressAsStringTask
{
    public static Optional<String> run(byte[] IPAddress)
    {
        Byte x;
        String IPAddressString = "";
        if(IPAddress != null && IPAddress.length == 4)
        {
            IPAddressString = ConvertByteWithoutOverflowingToStringTask.run(IPAddressString, IPAddress[0]);
            IPAddressString += ".";
            IPAddressString = ConvertByteWithoutOverflowingToStringTask.run(IPAddressString, IPAddress[1]);
            IPAddressString += ".";
            IPAddressString = ConvertByteWithoutOverflowingToStringTask.run(IPAddressString, IPAddress[2]);
            IPAddressString += ".";
            IPAddressString = ConvertByteWithoutOverflowingToStringTask.run(IPAddressString, IPAddress[3]);
            return Optional.of(IPAddressString);
        }
        else
        {
            return Optional.empty();
        }
    }
}
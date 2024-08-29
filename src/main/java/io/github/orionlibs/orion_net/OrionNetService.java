package io.github.orionlibs.orion_net;

import io.github.orionlibs.orion_net.tasks.BuildIPAddressAsByteArrayTask;
import io.github.orionlibs.orion_net.tasks.BuildIPAddressAsStringTask;
import java.util.Optional;

public class OrionNetService
{
    public static byte[] buildIPAddressAsByteArray(String IPAddress)
    {
        return BuildIPAddressAsByteArrayTask.run(IPAddress);
    }


    public static Optional<String> buildIPAddressAsString(byte[] IPAddress)
    {
        return BuildIPAddressAsStringTask.run(IPAddress);
    }
}
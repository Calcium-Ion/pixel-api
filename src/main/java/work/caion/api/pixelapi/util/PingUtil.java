package work.caion.api.pixelapi.util;

import cn.hutool.json.JSONObject;

import java.io.IOException;
import java.net.InetSocketAddress;

public class PingUtil {

    public static JSONObject ping(String ip, int port) throws IOException {
        InetSocketAddress inet = new InetSocketAddress(ip, port);
        ServerListPing19 slp = new ServerListPing19();
        slp.setAddress(inet);
        return slp.fetchData();
    }
}

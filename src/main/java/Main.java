import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class Main {
    public static void main(String[] args) {

        String ipAddress = "94.55.118.33";

        GeoIPService geoIPService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
        String result = geoIPServiceSoap.getIpLocation20(ipAddress);

        System.out.println(result);

    }
}

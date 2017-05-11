package it.polpetta.libris.image;

import it.polpetta.libris.image.azure.contract.IAzureImageSearchResult;
import it.polpetta.libris.image.azure.imageRecognition.AzureImageSearchResult;
import it.polpetta.libris.image.google.contract.IGoogleImageSearchResult;
import junit.framework.*;
import org.junit.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by zanna on 11/05/17.
 */
public class ReverseImageSearchTest extends TestCase {

    public void testAzureImageSearchReturnNotNull() throws IOException {
        URL url = new URL("http://1.bp.blogspot.com/-EZ-EdfiRhUc/VU75RcSB8OI/AAAAAAAAC4E/7ouyZ9H-zco/s1600/patata.jpg");
        String key = System.getProperty("AZURE_KEY");
        IAzureImageSearchResult res = ReverseImageSearch
                                        .getAzureServices(key)
                                        .imageSearchBuildQuery()
                                        .setImage(url)
                                        .build()
                                        .search();
        org.junit.Assert.assertNotNull(res);
    }

    public void testGoogleImageSearchReturnNotNull() throws IOException {
        URL url = new URL("http://1.bp.blogspot.com/-EZ-EdfiRhUc/VU75RcSB8OI/AAAAAAAAC4E/7ouyZ9H-zco/s1600/patata.jpg");
        IGoogleImageSearchResult res = ReverseImageSearch
                .getGoogleServices()
                .imageSearchBuildQuery()
                .setImage(url)
                .build()
                .search();
        org.junit.Assert.assertNotNull(res);
    }

}
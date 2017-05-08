package it.polpetta.libris.image.azure.contract;

import it.polpetta.libris.contract.ISearchResult;

import java.util.ArrayList;

/**
 * Created by davide on 06/05/17.
 */
public interface IAzureImageSearchResult extends ISearchResult {

    String getBestGuess();
    ArrayList<String> getLinks();
    ArrayList<String> getDescription();
    ArrayList<String> getTitles();
    ArrayList<String> getSimilarImages();
}

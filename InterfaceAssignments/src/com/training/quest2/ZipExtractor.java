package com.training.quest2;

public class ZipExtractor implements Extractor{
    @Override
    public void extractFiles(String[] filenames) {
        for(int i = 0; i<filenames.length; i++){
            System.out.println(filenames[i]);
        }

    }
}

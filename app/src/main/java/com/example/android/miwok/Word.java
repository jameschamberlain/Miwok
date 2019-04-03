package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation of the word */
    private String defaultTranslation;
    /** Miwok translation of the word */
    private String miwokTranslation;
    /** Image resource ID for the word */
    private int imageResourceId = NO_IMAGE_PROVIDED;
    /** Tells whether the word has an associated image */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Sound resource ID for the word */
    private int soundResourceId;

    /**
     *
     * Constructor for a new word
     *
     * @param newDefaultTranslation The default translation of the new word
     * @param newMiwokTranslation The Miwok translation of the new word
     * @param newSoundResourceId The sound resource ID associated with the new word
     */
    Word(String newDefaultTranslation, String newMiwokTranslation, int newSoundResourceId) {
        this.defaultTranslation = newDefaultTranslation;
        this.miwokTranslation = newMiwokTranslation;
        this.soundResourceId = newSoundResourceId;
    }

    /**
     *
     * Constructor for a new word
     *
     * @param newDefaultTranslation The default translation of the new word
     * @param newMiwokTranslation The Miwok translation of the new word
     * @param newImageResourceId The image resource ID associated with the new word
     * @param newSoundResourceId The sound resource ID associated with the new word
     */
    Word(String newDefaultTranslation, String newMiwokTranslation, int newImageResourceId, int newSoundResourceId) {
        this.defaultTranslation = newDefaultTranslation;
        this.miwokTranslation = newMiwokTranslation;
        this.imageResourceId = newImageResourceId;
        this.soundResourceId = newSoundResourceId;
    }

    /**
     *
     * Gets the default translation of the word
     *
     * @return A String containing the default translation
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     *
     * Gets the Miwok translation of the word
     *
     * @return A String containing the Miwok translation
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /**
     *
     * Gets the image resource ID of the word
     *
     * @return An int containing the image resource ID
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     *
     * Gets whether the word has an associated image
     *
     * @return A boolean containing whether the word has an associated image
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * Gets the sound resource ID of the word
     *
     * @return An int containing the sound resource ID
     */
    public int getSoundResourceId() {
        return soundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", soundResourceId=" + soundResourceId +
                '}';
    }
}
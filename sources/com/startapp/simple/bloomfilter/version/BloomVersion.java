package com.startapp.simple.bloomfilter.version;

import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: loaded from: classes11.dex */
public enum BloomVersion {
    ZERO("0", 1, 720),
    THREE("3.0", 1, 720) { // from class: com.startapp.simple.bloomfilter.version.BloomVersion.1
        @Override // com.startapp.simple.bloomfilter.version.BloomVersion
        public String substringFromBloom(String str) {
            int length = str.length();
            return length > 20 ? str.substring(0, length - 20) : str;
        }
    },
    FOUR(Protocol.VAST_1_0_WRAPPER, 3, 3500),
    FIVE("5", 3, 1000000);

    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    public int getNumberOfHashes() {
        return this.numberOfHashes;
    }

    public int getSizeOfBucket() {
        return this.sizeOfBucket;
    }

    public String getVersion() {
        return this.version;
    }

    public String substringFromBloom(String str) {
        return str;
    }

    BloomVersion(String str, int i10, int i11) {
        this.version = str;
        this.numberOfHashes = i10;
        this.sizeOfBucket = i11;
    }
}

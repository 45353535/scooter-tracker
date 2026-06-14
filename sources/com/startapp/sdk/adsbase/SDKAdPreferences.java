package com.startapp.sdk.adsbase;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class SDKAdPreferences implements Serializable {
    private static final long serialVersionUID = 2055046185195723724L;
    private Gender gender = null;
    private String age = null;

    @Keep
    public enum Gender {
        MALE("m"),
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE);

        private final String gender;

        Gender(String str) {
            this.gender = str;
        }

        public static Gender parseString(String str) {
            for (Gender gender : values()) {
                if (gender.getGender().equals(str)) {
                    return gender;
                }
            }
            return null;
        }

        public String getGender() {
            return this.gender;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.gender;
        }
    }

    @Keep
    public String getAge() {
        return this.age;
    }

    @Keep
    public Gender getGender() {
        return this.gender;
    }

    @Keep
    public SDKAdPreferences setAge(int i10) {
        this.age = Integer.toString(i10);
        return this;
    }

    @Keep
    public SDKAdPreferences setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @Keep
    public SDKAdPreferences setAge(String str) {
        this.age = str;
        return this;
    }
}

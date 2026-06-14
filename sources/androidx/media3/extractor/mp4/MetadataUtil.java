package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes5.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    private static final String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    @Nullable
    private static CommentFrame parseCommentAttribute(int i10, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i11 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    @Nullable
    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        int i10 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        String str = fullAtomFlags == 13 ? "image/jpeg" : fullAtomFlags == 14 ? MimeTypes.IMAGE_PNG : null;
        if (str == null) {
            Log.w(TAG, "Unrecognized cover art flags: " + fullAtomFlags);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i11 = i10 - 16;
        byte[] bArr = new byte[i11];
        parsableByteArray.readBytes(bArr, 0, i11);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int i10 = parsableByteArray.readInt();
        int i11 = (i10 >> 24) & 255;
        try {
            if (i11 == TYPE_TOP_BYTE_COPYRIGHT || i11 == TYPE_TOP_BYTE_REPLACEMENT) {
                int i12 = 16777215 & i10;
                if (i12 == SHORT_TYPE_COMMENT) {
                    return parseCommentAttribute(i10, parsableByteArray);
                }
                if (i12 == SHORT_TYPE_NAME_1 || i12 == SHORT_TYPE_NAME_2) {
                    return parseTextAttribute(i10, "TIT2", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_COMPOSER_1 || i12 == SHORT_TYPE_COMPOSER_2) {
                    return parseTextAttribute(i10, "TCOM", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_YEAR) {
                    return parseTextAttribute(i10, "TDRC", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_ARTIST) {
                    return parseTextAttribute(i10, "TPE1", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_ENCODER) {
                    return parseTextAttribute(i10, "TSSE", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_ALBUM) {
                    return parseTextAttribute(i10, "TALB", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_LYRICS) {
                    return parseTextAttribute(i10, "USLT", parsableByteArray);
                }
                if (i12 == SHORT_TYPE_GENRE) {
                    return parseTextAttribute(i10, "TCON", parsableByteArray);
                }
                if (i12 == TYPE_GROUPING) {
                    return parseTextAttribute(i10, "TIT1", parsableByteArray);
                }
            } else {
                if (i10 == TYPE_GENRE) {
                    return parseStandardGenreAttribute(parsableByteArray);
                }
                if (i10 == TYPE_DISK_NUMBER) {
                    return parseIndexAndCountAttribute(i10, "TPOS", parsableByteArray);
                }
                if (i10 == TYPE_TRACK_NUMBER) {
                    return parseIndexAndCountAttribute(i10, "TRCK", parsableByteArray);
                }
                if (i10 == TYPE_TEMPO) {
                    return parseIntegerAttribute(i10, "TBPM", parsableByteArray, true, false);
                }
                if (i10 == TYPE_COMPILATION) {
                    return parseIntegerAttribute(i10, "TCMP", parsableByteArray, true, true);
                }
                if (i10 == TYPE_COVER_ART) {
                    return parseCoverArt(parsableByteArray);
                }
                if (i10 == TYPE_ALBUM_ARTIST) {
                    return parseTextAttribute(i10, "TPE2", parsableByteArray);
                }
                if (i10 == TYPE_SORT_TRACK_NAME) {
                    return parseTextAttribute(i10, "TSOT", parsableByteArray);
                }
                if (i10 == TYPE_SORT_ALBUM) {
                    return parseTextAttribute(i10, "TSOA", parsableByteArray);
                }
                if (i10 == TYPE_SORT_ARTIST) {
                    return parseTextAttribute(i10, "TSOP", parsableByteArray);
                }
                if (i10 == TYPE_SORT_ALBUM_ARTIST) {
                    return parseTextAttribute(i10, "TSO2", parsableByteArray);
                }
                if (i10 == TYPE_SORT_COMPOSER) {
                    return parseTextAttribute(i10, "TSOC", parsableByteArray);
                }
                if (i10 == TYPE_RATING) {
                    return parseIntegerAttribute(i10, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (i10 == TYPE_GAPLESS_ALBUM) {
                    return parseIntegerAttribute(i10, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (i10 == TYPE_TV_SORT_SHOW) {
                    return parseTextAttribute(i10, "TVSHOWSORT", parsableByteArray);
                }
                if (i10 == TYPE_TV_SHOW) {
                    return parseTextAttribute(i10, "TVSHOW", parsableByteArray);
                }
                if (i10 == TYPE_INTERNAL) {
                    return parseInternalAttribute(parsableByteArray, position);
                }
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Atom.getAtomTypeString(i10));
            parsableByteArray.setPosition(position);
            return null;
        } finally {
            parsableByteArray.setPosition(position);
        }
    }

    @Nullable
    private static TextInformationFrame parseIndexAndCountAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i11 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String str2 = "" + unsignedShort;
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + "/" + unsignedShort2;
                }
                return new TextInformationFrame(str, (String) null, ImmutableList.of(str2));
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    @Nullable
    private static Id3Frame parseIntegerAttribute(int i10, String str, ParsableByteArray parsableByteArray, boolean z10, boolean z11) {
        int integerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z11) {
            integerAttribute = Math.min(1, integerAttribute);
        }
        if (integerAttribute >= 0) {
            return z10 ? new TextInformationFrame(str, (String) null, ImmutableList.of(Integer.toString(integerAttribute))) : new CommentFrame("und", str, Integer.toString(integerAttribute));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    @Nullable
    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i10) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i11 = -1;
        int i12 = -1;
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i13 = parsableByteArray.readInt();
            int i14 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i14 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i13 - 12);
            } else if (i14 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i13 - 12);
            } else {
                if (i14 == 1684108385) {
                    i11 = position;
                    i12 = i13;
                }
                parsableByteArray.skipBytes(i13 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i11 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i11);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i12 - 16));
    }

    @Nullable
    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i10, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i10) {
                return null;
            }
            int i11 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int i12 = parsableByteArray.readInt();
                int i13 = parsableByteArray.readInt();
                int i14 = i11 - 16;
                byte[] bArr = new byte[i14];
                parsableByteArray.readBytes(bArr, 0, i14);
                return new MdtaMetadataEntry(str, bArr, i13, i12);
            }
            parsableByteArray.setPosition(position + i11);
        }
    }

    @Nullable
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String strResolveV1Genre = Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (strResolveV1Genre != null) {
            return new TextInformationFrame("TCON", (String) null, ImmutableList.of(strResolveV1Genre));
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    private static TextInformationFrame parseTextAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int i11 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, (String) null, ImmutableList.of(parsableByteArray.readNullTerminatedString(i11 - 16)));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    public static void setFormatGaplessInfo(int i10, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i10 == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    public static void setFormatMetadata(int i10, @Nullable Metadata metadata, Format.Builder builder, Metadata... metadataArr) {
        Metadata metadata2 = new Metadata(new Metadata.Entry[0]);
        if (metadata != null) {
            for (int i11 = 0; i11 < metadata.length(); i11++) {
                Metadata.Entry entry = metadata.get(i11);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.key.equals("com.android.capture.fps")) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i10 == 2) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    private static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int i10 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i11 = i10 - 16;
            if (i11 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i11 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i11 != 3) {
                if (i11 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                    return parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                return parsableByteArray.readUnsignedInt24();
            }
        }
        Log.w(TAG, "Failed to parse data atom to int");
        return -1;
    }
}

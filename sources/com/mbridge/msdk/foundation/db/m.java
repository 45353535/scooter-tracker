package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;

/* JADX INFO: loaded from: classes10.dex */
public class m extends a<Campaign> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f48365a;

    private m(f fVar) {
        super(fVar);
    }

    public static synchronized m a(f fVar) {
        try {
            if (f48365a == null) {
                f48365a = new m(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #7 {all -> 0x007d, blocks: (B:10:0x001a, B:12:0x0020, B:13:0x0025, B:15:0x002b, B:39:0x00a5, B:41:0x00a9), top: B:70:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.mbridge.msdk.foundation.entity.m b(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.b(java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public synchronized void a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
            } else {
                getWritableDatabase().delete("video", "video_url = ? ", strArr);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(String str, long j10) {
        ContentValues contentValues;
        if (j10 == 0) {
            return;
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j10 / 1000));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        if (a(str, "")) {
            getWritableDatabase().update("video", contentValues, "video_url = ? ", new String[]{str});
            return;
        }
        return;
    }

    public synchronized long a(CampaignEx campaignEx, long j10, String str, int i10) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("unitid", campaignEx.getCampaignUnitId());
                contentValues.put("id", campaignEx.getId());
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put("video_url", campaignEx.getVideoUrlEncode());
                contentValues.put("total_size", Long.valueOf(j10));
                contentValues.put("video_state", Integer.valueOf(i10));
                contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("ad_bid_token", campaignEx.getBidToken());
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("video_path", str);
                }
                if (a(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                    return 0L;
                }
                return getWritableDatabase().insert("video", null, contentValues);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("VideoDao", e10.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[EXC_TOP_SPLITTER, PHI: r0
  0x00a4: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:26:0x00a2, B:21:0x0092] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.mbridge.msdk.foundation.entity.m b(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La8
            r0 = 0
            if (r7 == 0) goto La
            monitor-exit(r5)
            return r0
        La:
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch: java.lang.Throwable -> La8
            r7.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r1.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "SELECT * FROM video"
            r1.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = " WHERE video_url = ? "
            r1.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La8
            android.database.sqlite.SQLiteDatabase r2 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            android.database.Cursor r0 = r2.rawQuery(r1, r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r0 == 0) goto L92
            int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r6 <= 0) goto L92
        L36:
            boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            if (r6 == 0) goto L92
            java.lang.String r6 = "video_url"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r7.b(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = "video_state"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r7.a(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = "pregeress_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r7.b(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = "total_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r7.b(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = "video_path"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r7.a(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            java.lang.String r6 = "video_download_start"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7.a(r1)     // Catch: java.lang.Throwable -> L8e java.lang.Exception -> L90
            goto L36
        L8e:
            r6 = move-exception
            goto Lac
        L90:
            r6 = move-exception
            goto L95
        L92:
            if (r0 == 0) goto Laa
            goto La4
        L95:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto La2
            java.lang.String r1 = "VideoDao"
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8e
            com.mbridge.msdk.foundation.tools.q0.b(r1, r6)     // Catch: java.lang.Throwable -> L8e
        La2:
            if (r0 == 0) goto Laa
        La4:
            r0.close()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Laa
            goto Laa
        La8:
            r6 = move-exception
            goto Lb2
        Laa:
            monitor-exit(r5)
            return r7
        Lac:
            if (r0 == 0) goto Lb1
            r0.close()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lb1
        Lb1:
            throw r6     // Catch: java.lang.Throwable -> La8
        Lb2:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La8
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.b(java.lang.String, java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public synchronized boolean a(String str, String str2) {
        String[] strArr;
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "SELECT id FROM video WHERE video_url = ? ";
                strArr = new String[]{str};
            } else {
                strArr = new String[]{str, str2};
                str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            }
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e10.getLocalizedMessage());
                    }
                }
                return true;
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e11.getLocalizedMessage());
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public synchronized long a(String str, long j10, int i10, long j11) {
        int iUpdate = -1;
        try {
            if (getWritableDatabase() == null) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("pregeress_size", Long.valueOf(j10));
            contentValues.put("video_state", Integer.valueOf(i10));
            contentValues.put("total_size", Long.valueOf(j11));
            if (a(str, "")) {
                String[] strArr = {str};
                synchronized (new Object()) {
                    iUpdate = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e10.getLocalizedMessage());
            }
        }
        return iUpdate;
    }
}

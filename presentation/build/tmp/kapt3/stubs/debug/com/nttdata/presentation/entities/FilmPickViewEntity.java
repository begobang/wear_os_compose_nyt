package com.nttdata.presentation.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010+\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0006H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019\u00a8\u0006:"}, d2 = {"Lcom/nttdata/presentation/entities/FilmPickViewEntity;", "", "display_title", "", "mpaa_rating", "critics_pick", "", "byline", "headline", "summary_short", "publication_date", "opening_date", "date_updated", "link", "Lcom/nttdata/presentation/entities/FilmPickLinkViewEntity;", "multimedia", "Lcom/nttdata/presentation/entities/FilmPickMultimediaViewEntity;", "added", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nttdata/presentation/entities/FilmPickLinkViewEntity;Lcom/nttdata/presentation/entities/FilmPickMultimediaViewEntity;Z)V", "getAdded", "()Z", "setAdded", "(Z)V", "getByline", "()Ljava/lang/String;", "getCritics_pick", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDate_updated", "getDisplay_title", "getHeadline", "getLink", "()Lcom/nttdata/presentation/entities/FilmPickLinkViewEntity;", "getMpaa_rating", "getMultimedia", "()Lcom/nttdata/presentation/entities/FilmPickMultimediaViewEntity;", "getOpening_date", "getPublication_date", "getSummary_short", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nttdata/presentation/entities/FilmPickLinkViewEntity;Lcom/nttdata/presentation/entities/FilmPickMultimediaViewEntity;Z)Lcom/nttdata/presentation/entities/FilmPickViewEntity;", "equals", "other", "hashCode", "toString", "presentation_debug"})
public final class FilmPickViewEntity {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String display_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mpaa_rating = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer critics_pick = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String headline = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String summary_short = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String publication_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String opening_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String date_updated = null;
    @org.jetbrains.annotations.Nullable()
    private final com.nttdata.presentation.entities.FilmPickLinkViewEntity link = null;
    @org.jetbrains.annotations.Nullable()
    private final com.nttdata.presentation.entities.FilmPickMultimediaViewEntity multimedia = null;
    private boolean added;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.presentation.entities.FilmPickViewEntity copy(@org.jetbrains.annotations.Nullable()
    java.lang.String display_title, @org.jetbrains.annotations.Nullable()
    java.lang.String mpaa_rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer critics_pick, @org.jetbrains.annotations.Nullable()
    java.lang.String byline, @org.jetbrains.annotations.Nullable()
    java.lang.String headline, @org.jetbrains.annotations.Nullable()
    java.lang.String summary_short, @org.jetbrains.annotations.Nullable()
    java.lang.String publication_date, @org.jetbrains.annotations.Nullable()
    java.lang.String opening_date, @org.jetbrains.annotations.Nullable()
    java.lang.String date_updated, @org.jetbrains.annotations.Nullable()
    com.nttdata.presentation.entities.FilmPickLinkViewEntity link, @org.jetbrains.annotations.Nullable()
    com.nttdata.presentation.entities.FilmPickMultimediaViewEntity multimedia, boolean added) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FilmPickViewEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String display_title, @org.jetbrains.annotations.Nullable()
    java.lang.String mpaa_rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer critics_pick, @org.jetbrains.annotations.Nullable()
    java.lang.String byline, @org.jetbrains.annotations.Nullable()
    java.lang.String headline, @org.jetbrains.annotations.Nullable()
    java.lang.String summary_short, @org.jetbrains.annotations.Nullable()
    java.lang.String publication_date, @org.jetbrains.annotations.Nullable()
    java.lang.String opening_date, @org.jetbrains.annotations.Nullable()
    java.lang.String date_updated, @org.jetbrains.annotations.Nullable()
    com.nttdata.presentation.entities.FilmPickLinkViewEntity link, @org.jetbrains.annotations.Nullable()
    com.nttdata.presentation.entities.FilmPickMultimediaViewEntity multimedia, boolean added) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplay_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMpaa_rating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCritics_pick() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getByline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeadline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary_short() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublication_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOpening_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_updated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.presentation.entities.FilmPickLinkViewEntity component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.presentation.entities.FilmPickLinkViewEntity getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.presentation.entities.FilmPickMultimediaViewEntity component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.presentation.entities.FilmPickMultimediaViewEntity getMultimedia() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getAdded() {
        return false;
    }
    
    public final void setAdded(boolean p0) {
    }
}
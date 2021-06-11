package com.omi.omninos.sample.api;

import com.google.gson.annotations.SerializedName;
import com.omi.omninos.sample.model.CategoryModel;

import java.util.List;

public class ContentsResponse {

    @SerializedName("api_key")
    public String apiKey;

    @SerializedName("name")
    public String name;

    @SerializedName("description")
    public String description;

    @SerializedName("status")
    public String status;

    @SerializedName("last_updated_at")
    public long lastUpdatedAt;

    @SerializedName("categories")
    public List<CategoryModel> categories;
}

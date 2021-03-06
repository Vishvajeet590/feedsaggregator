package org.jboss.feedsagg.config;

import java.util.Objects;

/**
 * Model class for feed configuration
 */
public class FeedConfig {

    String code;

    String url;

    String group;

    String author;

    public FeedConfig(String group, String code, String url, String author) {
        this.code = code;
        this.url = url;
        this.group = group;
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeedConfig{");
        sb.append("code='").append(code).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        FeedConfig that = (FeedConfig) o;
        return url.equals(that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
}

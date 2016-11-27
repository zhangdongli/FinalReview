package com.zdl.finalreview.dao.models;

import java.util.List;

/**
 * Created by zhangdongli on 16/11/25.
 * 题目
 */

import com.zdl.finalreview.dao.configs.QuestionEsConfig;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

@Document(indexName = QuestionEsConfig.INDEX_NAME, type = QuestionEsConfig.TYPE_NAME)
public class Question {

    /**
     * 序号
     */
    @Id
    private int order;

    /**
     * 类型
     */
    @Field(type = FieldType.Integer)
    private int type;

    /**
     * 标题
     */
    @Field(type = FieldType.String, index = FieldIndex.analyzed, store = true, analyzer = "ik", searchAnalyzer = "ik")
    private String title;

    /**
     * 标题拼音集合
     */
    private List<String> titleSpells;

    /**
     * 标题拼音简写集合
     */
    private List<String> titleSimpSpells;

    /**
     * 选项集合
     */
    private List<String> options;

    /**
     * 答案集合
     */
    private List<String> anwers;

    public Question(int order, int type, String title, List<String> titleSpells, List<String> titleSimpSpells, List<String> options, List<String> anwers) {
        this.order = order;
        this.type = type;
        this.title = title;
        this.titleSpells = titleSpells;
        this.titleSimpSpells = titleSimpSpells;
        this.options = options;
        this.anwers = anwers;
    }

    public Question() {
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTitleSpells() {
        return titleSpells;
    }

    public void setTitleSpells(List<String> titleSpells) {
        this.titleSpells = titleSpells;
    }

    public List<String> getTitleSimpSpells() {
        return titleSimpSpells;
    }

    public void setTitleSimpSpells(List<String> titleSimpSpells) {
        this.titleSimpSpells = titleSimpSpells;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getAnwers() {
        return anwers;
    }

    public void setAnwers(List<String> anwers) {
        this.anwers = anwers;
    }


    @Override
    public String toString() {
        return "Question:{order=" + this.order + ",type=" + this.type + ",title=" + this.title + "}";
    }
}

CREATE TABLE attribute
(
    at_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    attribute_text VARCHAR(256),
    sub_ch_attribute BIGINT,
    ex_id BIGINT,
    internal BOOLEAN,
    in_id BIGINT,
    external BOOLEAN,
    CONSTRAINT FK_attribute FOREIGN KEY (sub_ch_attribute) REFERENCES sub_ch(sub_ch_id)
);

CREATE TABLE sub_ch
(
  sub_ch_id BIGINT PRIMARY KEY AUTO_INCREMENT,
  sub_text VARCHAR(256),
  parent_ch_id BIGINT,
  CONSTRAINT FK_sub_ch FOREIGN KEY (parent_ch_id) REFERENCES characteristics(ch_id)
);

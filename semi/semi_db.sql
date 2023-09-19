DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
	`user_id`	varchar(30)	NOT NULL,
	`user_email`	varchar(50)	NULL,
	`user_pw`	varchar(200)	NULL,
	`user_bday`	date	NULL,
	`user_gender`	char	NULL,
	`user_role`	char	NULL,
	`user_start`	date	NULL
);

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
	`post_num`	int	NOT NULL,
	`post_user_id`	varchar(30)	NOT NULL,
	`post_title`	varchar(50)	NULL,
	`post_image`	varchar(255)	NULL,
	`post_content`	longtext	NULL,
	`post_view`	int	NULL,
	`post_created_date`	date	NULL
);

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
	`ad_num`	int	NOT NULL,
	`ad_user_id`	varchar(30)	NOT NULL,
	`ad_name`	varchar(15)	NULL,
	`ad_receiver`	varchar(15)	NULL,
	`ad_phone`	varchar(15)	NULL	COMMENT '01@-@@@@-@@@@',
	`ad_address`	varchar(50)	NULL,
	`ad_postal_code`	int	NULL
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`pd_num`	int	NOT NULL,
	`pd_name`	varchar(50)	NULL,
	`pd_info`	longtext	NULL,
	`pd_image`	varchar(255)	NULL,
	`pd_count`	int	NULL,
	`pd_delivery_fee`	int	NULL,
	`pd_start`	date	NULL,
	`pd_rating`	int	NULL
);

DROP TABLE IF EXISTS `image_file`;

CREATE TABLE `image_file` (
	`file_id`	int unsigned auto_increment	NOT NULL,
	`file_name`	varchar(255)	NULL,
	`created_date`	timestamp DEFAULT current_timestamp	NULL,
	`modified_date`	timestamp DEFAULT current_timestamp	NULL
);

DROP TABLE IF EXISTS `review`;

CREATE TABLE `review` (
	`rv_num`	int	NOT NULL,
	`rv_pd_num`	int	NOT NULL,
	`rv_user_id`	varchar(30)	NOT NULL,
	`review_rating`	int	NULL,
	`rv_image`	varchar(255)	NULL,
	`rv_content`	longtext	NULL,
	`rv_created_at`	date	NULL
);

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
	`order_num`	int	NOT NULL,
	`order_pd_num`	int	NOT NULL,
	`order_user_id`	varchar(30)	NOT NULL,
	`order_create_at`	date	NULL,
	`order_shipping`	varchar(50)	NULL,
	`order_total_price`	int	NULL,
	`order_status`	varchar(10)	NULL,
	`order_refund`	varchar(1)	NULL
);

DROP TABLE IF EXISTS `product_option`;

CREATE TABLE `product_option` (
	`op_num`	int	NOT NULL,
	`op_pd_num`	int	NOT NULL,
	`op_content`	longtext	NULL,
	`op_price`	int	NULL,
	`op_stock`	int	NULL
);

DROP TABLE IF EXISTS `product_detail`;

CREATE TABLE `product_detail` (
	`detail_key`	int	NOT NULL,
	`contant`	varchar(600)	NULL,
	`product_image`	blob	NULL,
	`Field`	VARCHAR(255)	NULL
);

DROP TABLE IF EXISTS `shoppingcart`;

CREATE TABLE `shoppingcart` (
	`sc_num`	int	NOT NULL,
	`sc_user_id`	varchar(30)	NOT NULL,
	`sc_op_num`	int	NOT NULL,
	`sc_product_count`	int	NULL
);

DROP TABLE IF EXISTS `like`;

CREATE TABLE `like` (
	`like_num`	int	NOT NULL,
	`like_user_id`	varchar(30)	NOT NULL,
	`like_pd_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `refund`;

CREATE TABLE `refund` (
	`rf_num`	int	NOT NULL,
	`rf_order_num`	int	NOT NULL,
	`rf_reason`	varchar(255)	NULL,
	`rf_submit`	varchar(1)	NULL
);

DROP TABLE IF EXISTS `orderlist`;

CREATE TABLE `orderlist` (
	`ol_num`	int	NOT NULL,
	`ol_amount`	int	NULL,
	`ol_price`	int	NULL,
	`ol_op_num`	int	NOT NULL,
	`ol_order_num`	int	NOT NULL
);

ALTER TABLE `user` ADD CONSTRAINT `PK_USER` PRIMARY KEY (
	`user_id`
);

ALTER TABLE `post` ADD CONSTRAINT `PK_POST` PRIMARY KEY (
	`post_num`
);

ALTER TABLE `address` ADD CONSTRAINT `PK_ADDRESS` PRIMARY KEY (
	`ad_num`
);

ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
	`pd_num`
);

ALTER TABLE `image_file` ADD CONSTRAINT `PK_IMAGE_FILE` PRIMARY KEY (
	`file_id`
);

ALTER TABLE `review` ADD CONSTRAINT `PK_REVIEW` PRIMARY KEY (
	`rv_num`
);

ALTER TABLE `order` ADD CONSTRAINT `PK_ORDER` PRIMARY KEY (
	`order_num`
);

ALTER TABLE `product_option` ADD CONSTRAINT `PK_PRODUCT_OPTION` PRIMARY KEY (
	`op_num`
);

ALTER TABLE `product_detail` ADD CONSTRAINT `PK_PRODUCT_DETAIL` PRIMARY KEY (
	`detail_key`
);

ALTER TABLE `shoppingcart` ADD CONSTRAINT `PK_SHOPPINGCART` PRIMARY KEY (
	`sc_num`
);

ALTER TABLE `like` ADD CONSTRAINT `PK_LIKE` PRIMARY KEY (
	`like_num`
);

ALTER TABLE `refund` ADD CONSTRAINT `PK_REFUND` PRIMARY KEY (
	`rf_num`
);

ALTER TABLE `orderlist` ADD CONSTRAINT `PK_ORDERLIST` PRIMARY KEY (
	`ol_num`
);

ALTER TABLE `post` ADD CONSTRAINT `FK_user_TO_post_1` FOREIGN KEY (
	`post_user_id`
)
REFERENCES `user` (
	`user_id`
);

ALTER TABLE `address` ADD CONSTRAINT `FK_user_TO_address_1` FOREIGN KEY (
	`ad_user_id`
)
REFERENCES `user` (
	`user_id`
);

ALTER TABLE `review` ADD CONSTRAINT `FK_product_TO_review_1` FOREIGN KEY (
	`rv_pd_num`
)
REFERENCES `product` (
	`pd_num`
);

ALTER TABLE `review` ADD CONSTRAINT `FK_user_TO_review_1` FOREIGN KEY (
	`rv_user_id`
)
REFERENCES `user` (
	`user_id`
);

ALTER TABLE `order` ADD CONSTRAINT `FK_product_TO_order_1` FOREIGN KEY (
	`order_pd_num`
)
REFERENCES `product` (
	`pd_num`
);

ALTER TABLE `order` ADD CONSTRAINT `FK_user_TO_order_1` FOREIGN KEY (
	`order_user_id`
)
REFERENCES `user` (
	`user_id`
);

ALTER TABLE `product_option` ADD CONSTRAINT `FK_product_TO_product_option_1` FOREIGN KEY (
	`op_pd_num`
)
REFERENCES `product` (
	`pd_num`
);

ALTER TABLE `shoppingcart` ADD CONSTRAINT `FK_user_TO_shoppingcart_1` FOREIGN KEY (
	`sc_user_id`
)
REFERENCES `user` (
	`user_id`
);

ALTER TABLE `shoppingcart` ADD CONSTRAINT `FK_product_option_TO_shoppingcart_1` FOREIGN KEY (
	`sc_op_num`
)
REFERENCES `product_option` (
	`op_num`
);

ALTER TABLE `like` ADD CONSTRAINT `FK_user_TO_like_1` FOREIGN KEY (
	`like_user_id`
)
REFERENCES `user` (
	`user_id`
);

ALTER TABLE `like` ADD CONSTRAINT `FK_product_TO_like_1` FOREIGN KEY (
	`like_pd_num`
)
REFERENCES `product` (
	`pd_num`
);

ALTER TABLE `refund` ADD CONSTRAINT `FK_order_TO_refund_1` FOREIGN KEY (
	`rf_order_num`
)
REFERENCES `order` (
	`order_num`
);

ALTER TABLE `orderlist` ADD CONSTRAINT `FK_product_option_TO_orderlist_1` FOREIGN KEY (
	`ol_op_num`
)
REFERENCES `product_option` (
	`op_num`
);

ALTER TABLE `orderlist` ADD CONSTRAINT `FK_order_TO_orderlist_1` FOREIGN KEY (
	`ol_order_num`
)
REFERENCES `order` (
	`order_num`
);


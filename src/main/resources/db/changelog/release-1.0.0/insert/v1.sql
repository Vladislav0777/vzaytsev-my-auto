delete from consumable_status
where id >=0;
delete from status_auto
where id >=0;

INSERT INTO consumable_status (id,consumable_code, consumable_name)
VALUES
    (1, 'A', 'Отличное'),
    (2, 'B', 'Удовлетворительное'),
    (3, 'C', 'Нуждается в срочном ремонте'),
    (4, 'D', 'Сломается с минуты на минуту');

INSERT INTO status_auto (id,status_code, status_name)
VALUES
    (1, 'A', 'Срок замены расходников в норме(Недавно провели замену)'),
    (2, 'B', 'В ближайшие 3 месяца необходима замена расходников'),
    (3, 'C', 'В ближайшие 2 месяца необходима замена расходников'),
    (4, 'D', 'В ближайшие месяц необходима замена расходников!'),
    (5, 'E', 'Срочно замените расходники!');
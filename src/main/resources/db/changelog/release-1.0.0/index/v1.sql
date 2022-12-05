drop index if exists black_list_name_soundex;

create index black_list_name_soundex on bnpl.black_list (soundex(full_name));
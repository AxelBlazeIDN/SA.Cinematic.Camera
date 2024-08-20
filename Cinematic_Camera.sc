{$CLEO .csa}

:UnlockedByAB
set_char_health 26@ health_to 2000
set_char_proofs 26@ immunities BP 1 FP 1 EP 1 CP 1 MP 1
get_char_heading 2@ = actor $PLAYER_ACTOR
set_char_heading 26@ Z_angle_to 2@
set_char_visible 26@ visibility 0
set_char_collision 26@ collision_detection 0
freeze_char_position_and_dont_load_collision 26@ keep_position 1
set_cleo_shared_var 25393 to 
nop 
set_char_been_photographed_flag 
get_offset_from_object_in_world_coords 1 1 
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 108
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 108
write_memory 21@ value 1 size 4 add_ib 0 protect 0
23@ = 0.0
24@ = 0.0
25@ = 0.0
wait 0
set_char_health 26@ health_to 2000
set_player_control $PLAYER_CHAR can_move 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -685
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 254
goto_if_false -587
if and
  is_float_lvar_equal_to_float_lvar 23@ == 10@
  is_float_lvar_equal_to_float_lvar 24@ == 11@
  is_float_lvar_equal_to_float_lvar 25@ == 12@
goto_if_false -580
set_cleo_shared_var 23290687 to 0
gosub @Noname_10676
get_label_pointer 0@ = get_label_addr -11785
23@ = 0.0
24@ = 0.0
25@ = 0.0
wait 500
goto -685
get_label_pointer 30@ = get_label_addr -11785
30@ += 30000
if 
  is_int_lvar_greater_or_equal_to_int_lvar 0@ >= 30@
goto_if_false -685
set_cleo_shared_var 23290687 to 0
gosub @Noname_10676
get_label_pointer 0@ = get_label_addr -11785
23@ = 0.0
24@ = 0.0
25@ = 0.0
wait 500
get_cleo_shared_var 30@ = get_mutex_var 23290687
if and
  30@ == 0
  is_float_lvar_equal_to_float_lvar 23@ == 10@
  is_float_lvar_equal_to_float_lvar 24@ == 11@
  is_float_lvar_equal_to_float_lvar 25@ == 12@
goto_if_false -768
if 
  is_widget_pressed 41
goto_if_false -768
set_cleo_shared_var 23290674 to 2
goto -9788
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -891
get_label_pointer 30@ = get_label_addr -11785
30@ += 30000
sub_int_lvar_from_int_lvar 30@ -= 0@
30@ /= 100
print_with_number_now 'number' number 30@ time 1 flag 1 // ~1~
get_label_pointer 30@ = get_label_addr -11785
30@ += 30000
if 
  is_int_lvar_greater_or_equal_to_int_lvar 0@ >= 30@
goto_if_false -891
goto @Noname_958
get_cleo_shared_var 30@ = get_mutex_var 23290687
if and
  30@ == 2
  is_float_lvar_equal_to_float_lvar 23@ == 10@
  is_float_lvar_equal_to_float_lvar 24@ == 11@
  is_float_lvar_equal_to_float_lvar 25@ == 12@
goto_if_false @Noname_1041
if 
  is_widget_pressed 41
goto_if_false @Noname_1041
gosub @Noname_10676
write_memory 0@ value 254 size 1 add_ib 0 protect 0
set_cleo_shared_var 23290674 to 2
set_cleo_shared_var 23290687 to 0
0@ = 0
23@ = 0.0
24@ = 0.0

:Noname_958
25@ = 0.0
goto -9788
if and
  is_float_lvar_equal_to_float_lvar 23@ == 10@
  is_float_lvar_equal_to_float_lvar 24@ == 11@
  is_float_lvar_equal_to_float_lvar 25@ == 12@
goto_if_false -1083
goto -1107
set_lvar_float_to_lvar_float 23@ = 10@
set_lvar_float_to_lvar_float 24@ = 11@
set_lvar_float_to_lvar_float 25@ = 12@

:Noname_1041
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -1193
gosub @Noname_10608
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 1
goto_if_false -1186
goto -1249
goto -1193
goto -1486
if 
  is_widget_pressed 76
goto_if_false -1486
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -1249
write_memory 0@ value 1 size 1 add_ib 0 protect 0
0@ += 1
8@ = 0.01
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
if 
  20@ < 0
goto_if_false @Noname_1331
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0.01
goto_if_false @Noname_1370
20@ = 0.01
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 72
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0

:Noname_1331
add_float_lvar_to_float_lvar 19@ += 20@
if 
  19@ > 5.0
goto_if_false -1436
19@ = 5.0

:Noname_1370
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -2127
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -1565
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 2
goto_if_false -1558
goto -1621
goto -1565
goto -1888
if 
  is_widget_pressed 77
goto_if_false -1888
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -1621
write_memory 0@ value 2 size 1 add_ib 0 protect 0
0@ += 1
8@ = 0.01
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
8@ *= -1.0
if 
  20@ > 0
goto_if_false -1713
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
20@ *= -1.0
if 
  20@ > 0.01
goto_if_false @Noname_1762
20@ = 0.01
20@ *= -1.0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 72
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0
add_float_lvar_to_float_lvar 19@ += 20@
if 
  19@ < -5.0
goto_if_false -1838

:Noname_1762
19@ = -5.0
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -2127
8@ = 0.01
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 72
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0
if 
  20@ > 0.0
goto_if_false -2037
sub_float_lvar_from_float_lvar 20@ -= 8@
if 
  20@ < 0.0
goto_if_false -2022
20@ = 0.0
add_float_lvar_to_float_lvar 19@ += 20@
goto -2084
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0.0
goto_if_false -2076
20@ = 0.0
add_float_lvar_to_float_lvar 19@ += 20@
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -2206
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 3
goto_if_false -2199
goto @Noname_2262
goto -2206
goto -2474
if 
  is_widget_pressed 52
goto_if_false -2474
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false @Noname_2262
write_memory 0@ value 3 size 1 add_ib 0 protect 0
0@ += 1
get_char_heading 10@ = actor 26@
8@ = 1.0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
if 

:Noname_2262
  20@ < 0
goto_if_false -2352
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 1.0
goto_if_false -2391
20@ = 1.0
add_float_lvar_to_float_lvar 10@ += 20@
if 
  10@ >= 360.0
goto_if_false -2430
10@ -= 360.0
set_char_heading 26@ Z_angle_to 10@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -3312
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -2553
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 4
goto_if_false -2546
goto -2609
goto -2553
goto -2851
if 
  is_widget_pressed 53
goto_if_false -2851
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -2609
write_memory 0@ value 4 size 1 add_ib 0 protect 0
0@ += 1
get_char_heading 10@ = actor 26@
8@ = 1.0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
8@ *= -1.0
if 
  20@ > 0
goto_if_false -2709
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
20@ *= -1.0
if 
  20@ > 1.0
goto_if_false -2758
20@ = 1.0
20@ *= -1.0
add_float_lvar_to_float_lvar 10@ += 20@
if 
  10@ < 0.0
goto_if_false -2807
10@ += 360.0
set_char_heading 26@ Z_angle_to 10@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -3312
get_char_heading 10@ = actor 26@
8@ = 1.0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 2.0
set_lvar_float_to_lvar_float 7@ = 20@
7@ /= 1.0
if 
  7@ < 0.0
goto_if_false -2955
7@ *= -1.0
6@ = 1.0
6@ *= 0.0015
19@ = 0.01
19@ *= 100.0
19@ -= 1.0
if 
  19@ > 0.0
goto_if_false @Noname_3041
mult_float_lvar_by_float_lvar 19@ *= 19@
goto -3059
mult_float_lvar_by_float_lvar 19@ *= 19@
19@ *= -1.0
19@ += 1.0
mult_float_lvar_by_float_lvar 6@ *= 19@
8@ *= 0.01
mult_float_lvar_by_float_lvar 8@ *= 7@
add_float_lvar_to_float_lvar 8@ += 6@
if 

:Noname_3041
  20@ > 0.0
goto_if_false -3203
sub_float_lvar_from_float_lvar 20@ -= 8@
if 
  20@ < 0
goto_if_false -3157
20@ = 0
add_float_lvar_to_float_lvar 10@ += 20@
if 
  10@ >= 360.0
goto_if_false -3196
10@ -= 360.0
goto -3275
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0
goto_if_false -3236
20@ = 0
add_float_lvar_to_float_lvar 10@ += 20@
if 
  10@ < 0.0
goto_if_false -3275
10@ += 360.0
set_char_heading 26@ Z_angle_to 10@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -3391
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 5
goto_if_false -3384
goto @Noname_3447
goto -3391
goto -3698
if 
  is_widget_pressed 97
goto_if_false -3698
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false @Noname_3447
write_memory 0@ value 5 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
get_char_heading 15@ = actor 26@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0

:Noname_3447
8@ *= 0.01
if 
  20@ < 0
goto_if_false -3551
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0.1
goto_if_false -3590
20@ = 0.1
sin 16@ = sine 15@
mult_float_lvar_by_float_lvar 16@ *= 20@
cos 17@ = cosine 15@
mult_float_lvar_by_float_lvar 17@ *= 20@
sub_float_lvar_from_float_lvar 10@ -= 16@
add_float_lvar_to_float_lvar 11@ += 17@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -4575
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -3777
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 6
goto_if_false -3770
goto @Noname_3833
goto -3777
goto -4114
if 
  is_widget_pressed 98
goto_if_false -4114
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false @Noname_3833
write_memory 0@ value 6 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
get_char_heading 15@ = actor 26@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0

:Noname_3833
8@ *= 0.01
8@ *= -1.0
if 
  20@ > 0
goto_if_false -3947
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
20@ *= -1.0
if 
  20@ > 0.1
goto_if_false -3996
20@ = 0.1
20@ *= -1.0
sin 16@ = sine 15@
mult_float_lvar_by_float_lvar 16@ *= 20@
cos 17@ = cosine 15@
mult_float_lvar_by_float_lvar 17@ *= 20@
sub_float_lvar_from_float_lvar 10@ -= 16@
add_float_lvar_to_float_lvar 11@ += 17@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -4575
get_char_coordinates 26@ position_to 10@ 11@ 12@
get_char_heading 15@ = actor 26@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 2.0
set_lvar_float_to_lvar_float 7@ = 20@
7@ /= 0.1
if 
  7@ < 0.0
goto_if_false -4232
7@ *= -1.0
6@ = 0.1
6@ *= 0.0015
19@ = 0.01
19@ *= 100.0
19@ -= 1.0
if 
  19@ > 0.0
goto_if_false @Noname_4318
mult_float_lvar_by_float_lvar 19@ *= 19@
goto -4336
mult_float_lvar_by_float_lvar 19@ *= 19@
19@ *= -1.0
19@ += 1.0
mult_float_lvar_by_float_lvar 6@ *= 19@
8@ *= 0.01
mult_float_lvar_by_float_lvar 8@ *= 7@
add_float_lvar_to_float_lvar 8@ += 6@
if 

:Noname_4318
  20@ > 0.0
goto_if_false -4441
sub_float_lvar_from_float_lvar 20@ -= 8@
if 
  20@ < 0
goto_if_false -4434
20@ = 0
goto -4474
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0
goto_if_false -4474
20@ = 0
sin 16@ = sine 15@
mult_float_lvar_by_float_lvar 16@ *= 20@
cos 17@ = cosine 15@
mult_float_lvar_by_float_lvar 17@ *= 20@
sub_float_lvar_from_float_lvar 10@ -= 16@
add_float_lvar_to_float_lvar 11@ += 17@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -4654
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 7
goto_if_false -4647
goto @Noname_4710
goto -4654
goto -5002
if 
  is_widget_pressed 100
goto_if_false -5002
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false @Noname_4710
write_memory 0@ value 7 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
get_char_heading 15@ = actor 26@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0

:Noname_4710
8@ *= 0.01
if 
  20@ < 0
goto_if_false -4814
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0.1
goto_if_false -4853
20@ = 0.1
15@ -= 90.0
if 
  15@ <= 0.0
goto_if_false -4894
15@ += 360.0
sin 16@ = sine 15@
mult_float_lvar_by_float_lvar 16@ *= 20@
cos 17@ = cosine 15@
mult_float_lvar_by_float_lvar 17@ *= 20@
sub_float_lvar_from_float_lvar 10@ -= 16@
add_float_lvar_to_float_lvar 11@ += 17@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -6002
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -5081
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 8
goto_if_false -5074
goto @Noname_5137
goto -5081
goto -5459
if 
  is_widget_pressed 99
goto_if_false -5459
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false @Noname_5137
write_memory 0@ value 8 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
get_char_heading 15@ = actor 26@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0

:Noname_5137
8@ *= 0.01
8@ *= -1.0
if 
  20@ > 0
goto_if_false -5251
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
20@ *= -1.0
if 
  20@ > 0.1
goto_if_false -5300
20@ = 0.1
20@ *= -1.0
15@ -= 90.0
if 
  15@ <= 0.0
goto_if_false -5351
15@ += 360.0
sin 16@ = sine 15@
mult_float_lvar_by_float_lvar 16@ *= 20@
cos 17@ = cosine 15@
mult_float_lvar_by_float_lvar 17@ *= 20@
sub_float_lvar_from_float_lvar 10@ -= 16@
add_float_lvar_to_float_lvar 11@ += 17@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -6002
get_char_coordinates 26@ position_to 10@ 11@ 12@
get_char_heading 15@ = actor 26@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 2.0
set_lvar_float_to_lvar_float 7@ = 20@
7@ /= 0.1
if 
  7@ < 0.0
goto_if_false -5577
7@ *= -1.0
6@ = 0.1
6@ *= 0.0015
19@ = 0.01
19@ *= 100.0
19@ -= 1.0
if 
  19@ > 0.0
goto_if_false @Noname_5663
mult_float_lvar_by_float_lvar 19@ *= 19@
goto -5681
mult_float_lvar_by_float_lvar 19@ *= 19@
19@ *= -1.0
19@ += 1.0
mult_float_lvar_by_float_lvar 6@ *= 19@
8@ *= 0.01
mult_float_lvar_by_float_lvar 8@ *= 7@
add_float_lvar_to_float_lvar 8@ += 6@
if 

:Noname_5663
  20@ > 0.0
goto_if_false -5827
sub_float_lvar_from_float_lvar 20@ -= 8@
if 
  20@ < 0
goto_if_false -5779
20@ = 0
15@ -= 90.0
if 
  15@ <= 0.0
goto_if_false -5820
15@ += 360.0
goto -5901
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0
goto_if_false -5860
20@ = 0
15@ -= 90.0
if 
  15@ <= 0.0
goto_if_false -5901
15@ += 360.0
sin 16@ = sine 15@
mult_float_lvar_by_float_lvar 16@ *= 20@
cos 17@ = cosine 15@
mult_float_lvar_by_float_lvar 17@ *= 20@
sub_float_lvar_from_float_lvar 10@ -= 16@
add_float_lvar_to_float_lvar 11@ += 17@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -6081
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 9
goto_if_false -6074
goto -6137
goto -6081
goto -6340
if 
  is_widget_pressed 46
goto_if_false -6340
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -6137
write_memory 0@ value 9 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
if 
  20@ < 0
goto_if_false -6233
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0.1
goto_if_false -6272
20@ = 0.1
add_float_lvar_to_float_lvar 12@ += 20@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -7121
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -6419
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 10
goto_if_false -6412
goto -6475
goto -6419
goto -6708
if 
  is_widget_pressed 47
goto_if_false -6708
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -6475
write_memory 0@ value 10 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
8@ *= -1.0
if 
  20@ > 0
goto_if_false -6581
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
20@ *= -1.0
if 
  20@ > 0.1
goto_if_false -6630
20@ = 0.1
20@ *= -1.0
add_float_lvar_to_float_lvar 12@ += 20@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -7121
get_char_coordinates 26@ position_to 10@ 11@ 12@
8@ = 0.1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 2.0
set_lvar_float_to_lvar_float 7@ = 20@
7@ /= 0.1
if 
  7@ < 0.0
goto_if_false -6818
7@ *= -1.0
6@ = 0.1
6@ *= 0.0015
19@ = 0.01
19@ *= 100.0
19@ -= 1.0
if 
  19@ > 0.0
goto_if_false @Noname_6904
mult_float_lvar_by_float_lvar 19@ *= 19@
goto -6922
mult_float_lvar_by_float_lvar 19@ *= 19@
19@ *= -1.0
19@ += 1.0
mult_float_lvar_by_float_lvar 6@ *= 19@
8@ *= 0.01
mult_float_lvar_by_float_lvar 8@ *= 7@
add_float_lvar_to_float_lvar 8@ += 6@
if 

:Noname_6904
  20@ > 0.0
goto_if_false -7027
sub_float_lvar_from_float_lvar 20@ -= 8@
if 
  20@ < 0
goto_if_false -7020
20@ = 0
goto -7060
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0
goto_if_false -7060
20@ = 0
add_float_lvar_to_float_lvar 12@ += 20@
12@ -= 1.0
set_char_coordinates 26@ at 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -7200
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 11
goto_if_false -7193
goto -7256
goto -7200
goto -7493
if 
  is_widget_pressed 44
goto_if_false -7493
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -7256
write_memory 0@ value 11 size 1 add_ib 0 protect 0
0@ += 1
8@ = 0.002
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
if 
  20@ < 0
goto_if_false @Noname_7338
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0.002
goto_if_false @Noname_7377
20@ = 0.002
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0

:Noname_7338
add_float_lvar_to_float_lvar 19@ += 20@
if 
  19@ > 0.3
goto_if_false -7443
19@ = 0.3

:Noname_7377
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -8462
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -7572
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 12
goto_if_false -7565
goto -7628
goto -7572
goto -7915
if 
  is_widget_pressed 45
goto_if_false -7915
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -7628
write_memory 0@ value 12 size 1 add_ib 0 protect 0
0@ += 1
8@ = 0.002
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 0.01
8@ *= -1.0
if 
  20@ > 0
goto_if_false -7720
8@ *= 2.0
add_float_lvar_to_float_lvar 20@ += 8@
20@ *= -1.0
if 
  20@ > 0.002
goto_if_false -7769
20@ = 0.002
20@ *= -1.0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0
add_float_lvar_to_float_lvar 19@ += 20@
19@ *= -1.0
if 
  19@ > 0.3
goto_if_false -7855
19@ = 0.3
19@ *= -1.0
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
goto -8462
8@ = 0.002
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
8@ *= 2.0
set_lvar_float_to_lvar_float 7@ = 20@
7@ /= 0.002
if 
  7@ < 0.0
goto_if_false -8011
7@ *= -1.0
6@ = 0.002
6@ *= 0.0015
19@ = 0.01
19@ *= 100.0
19@ -= 1.0
if 
  19@ > 0.0
goto_if_false @Noname_8097
mult_float_lvar_by_float_lvar 19@ *= 19@
goto -8115
mult_float_lvar_by_float_lvar 19@ *= 19@
19@ *= -1.0
19@ += 1.0
mult_float_lvar_by_float_lvar 6@ *= 19@
8@ *= 0.01
mult_float_lvar_by_float_lvar 8@ *= 7@
add_float_lvar_to_float_lvar 8@ += 6@
if 

:Noname_8097
  20@ > 0.0
goto_if_false -8300
sub_float_lvar_from_float_lvar 20@ -= 8@
if 
  20@ < 0
goto_if_false @Noname_8213
20@ = 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0
add_float_lvar_to_float_lvar 19@ += 20@
if 
  19@ > 0.3
goto_if_false -8279
19@ = 0.3

:Noname_8213
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
goto -8433
add_float_lvar_to_float_lvar 20@ += 8@
if 
  20@ > 0
goto_if_false @Noname_8333
20@ = 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
read_memory 19@ = read_mem_addr 22@ size 4 add_ib 0
add_float_lvar_to_float_lvar 19@ += 20@
19@ *= -1.0
if 
  19@ > 0.3
goto_if_false -8409

:Noname_8333
19@ = 0.3
19@ *= -1.0
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 1
goto_if_false -8534
read_memory 30@ = read_mem_addr 0@ size 1 add_ib 0
if 
  30@ == 13
goto_if_false -8534
0@ += 1
goto -8652
get_cleo_shared_var 30@ = get_mutex_var 23290687
if 
  30@ == 2
goto_if_false -8652
if and
  not is_widget_pressed 44
  not is_widget_pressed 45
  not is_widget_pressed 46
  not is_widget_pressed 47
  not is_widget_pressed 52
  not is_widget_pressed 53
  not is_widget_pressed 76
goto_if_false -8652
if and
  not is_widget_pressed 77
  not is_widget_pressed 97
  not is_widget_pressed 98
  not is_widget_pressed 99
  not is_widget_pressed 100
goto_if_false -8652
write_memory 0@ value 13 size 1 add_ib 0 protect 0
0@ += 1
get_char_coordinates 26@ position_to 10@ 11@ 12@
12@ += 0.8
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 8
write_memory 22@ value 10@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 12
write_memory 22@ value 11@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 16
write_memory 22@ value 12@ size 4 add_ib 0 protect 0
get_char_heading 20@ = actor 26@
sin 19@ = sine 20@
19@ *= 0.2
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 24
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
cos 19@ = cosine 20@
19@ *= 0.2
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 28
write_memory 22@ value 19@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 72
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
set_fixed_camera_position 10@ 11@ 12@ rotation 20@ 0.0 0.0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 24
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
sub_float_lvar_from_float_lvar 10@ -= 20@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 28
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
add_float_lvar_to_float_lvar 11@ += 20@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 32
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
add_float_lvar_to_float_lvar 12@ += 20@
point_camera_at_point 10@ 11@ 12@ switchstyle 2
goto -406
set_camera_behind_player 
restore_camera_jumpcut 
restore_camera 
camera_persist_fov 0
camera_set_shake_simulation_simple 1 timelimit 0.0 intensity 0.0
set_player_control $PLAYER_CHAR can_move 1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
read_memory 10@ = read_mem_addr 22@ size 4 add_ib 0
set_lvar_int_to_lvar_int 22@ = 21@

:Noname_9041
22@ += 40
read_memory 11@ = read_mem_addr 22@ size 4 add_ib 0
get_char_heading 20@ = actor 26@
sin 20@ = sine 20@
mult_float_lvar_by_float_lvar 20@ *= 10@
20@ *= -1.0
get_char_heading 19@ = actor 26@
cos 19@ = cosine 19@
mult_float_lvar_by_float_lvar 19@ *= 11@
add_float_lvar_to_float_lvar 20@ += 19@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 56
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
get_char_heading 20@ = actor 26@
20@ -= 90.0
if 
  20@ < 0.0
goto_if_false -9270
20@ += 360.0
sin 20@ = sine 20@
mult_float_lvar_by_float_lvar 20@ *= 10@
20@ *= -1.0
get_char_heading 19@ = actor 26@
19@ -= 90.0
if 
  19@ < 0.0
goto_if_false -9345
19@ += 360.0
cos 19@ = cosine 19@
mult_float_lvar_by_float_lvar 19@ *= 11@
add_float_lvar_to_float_lvar 20@ += 19@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 60
write_memory 22@ value 20@ size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 56
read_memory 10@ = read_mem_addr 22@ size 4 add_ib 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 60
read_memory 11@ = read_mem_addr 22@ size 4 add_ib 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
read_memory 12@ = read_mem_addr 22@ size 4 add_ib 0
10@ *= 80.0
11@ *= 80.0
12@ *= 80.0
set_char_velocity 26@ velocity_in_direction_XYZ 10@ 11@ 12@
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 184
read_memory 20@ = read_mem_addr 22@ size 4 add_ib 0
if 
  20@ == 0
goto_if_false -9576
set_player_control $PLAYER_CHAR can_move 1
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 36
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 40
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 44
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 48
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 52
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
set_lvar_int_to_lvar_int 22@ = 21@
22@ += 68
write_memory 22@ value 0.0 size 4 add_ib 0 protect 0
wait 200
set_cleo_shared_var 23290673 to 0
delete_char 26@
mark_char_as_no_longer_needed 26@
terminate_this_script 
wait 200
if 
  is_widget_pressed 41
goto_if_false -10597
get_cleo_shared_var 30@ = get_mutex_var 23290675
30@ += 1
if 
  30@ == 1
goto_if_false -9880
set_cleo_shared_var 23290674 to 0
set_cleo_shared_var 23290687 to 0
wait 500
goto -1107
goto -10597
if 
  30@ == 2
goto_if_false -10177
get_label_pointer 0@ = get_label_addr @Noname_10744
get_label_pointer 3@ = get_label_addr -11273
read_memory 2@ = read_mem_addr 0@ size 1 add_ib 0
write_memory 3@ value 2@ size 1 add_ib 0 protect 0
0@ += 1
3@ += 1
get_label_pointer 2@ = get_label_addr @Noname_11256
if 
  is_int_lvar_greater_or_equal_to_int_lvar 0@ >= 2@
goto_if_false -9918
get_label_pointer 0@ = get_label_addr @Noname_11256
get_offset_from_char_in_world_coords 2@ 3@ 4@ from_actor 26@ with_offset 0.0 0.0 -1.0
get_char_heading 5@ = actor 26@
write_memory 0@ value 2@ size 4 add_ib 0 protect 0
0@ += 4
write_memory 0@ value 3@ size 4 add_ib 0 protect 0
0@ += 4
write_memory 0@ value 4@ size 4 add_ib 0 protect 0
0@ += 4
write_memory 0@ value 5@ size 4 add_ib 0 protect 0
get_label_pointer 21@ = get_label_addr @Noname_10744
get_label_pointer 0@ = get_label_addr -11785
set_cleo_shared_var 23290867 to 1
set_cleo_shared_var 23290687 to 2
set_cleo_shared_var 23290674 to 0
wait 500
goto -1107
goto -10597
get_cleo_shared_var 0@ = get_mutex_var 23290867
if and
  0@ == 1
  30@ == 3
goto_if_false -10468
set_cleo_shared_var 23290674 to 0
set_cleo_shared_var 23290687 to 1
get_label_pointer 0@ = get_label_addr @Noname_11256
read_memory 2@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 4
read_memory 3@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 4
read_memory 4@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 4
read_memory 5@ = read_mem_addr 0@ size 4 add_ib 0
set_char_coordinates 26@ at 2@ 3@ 4@
set_char_heading 26@ Z_angle_to 5@
get_label_pointer 3@ = get_label_addr @Noname_10744
get_label_pointer 0@ = get_label_addr -11273
read_memory 2@ = read_mem_addr 0@ size 1 add_ib 0
write_memory 3@ value 2@ size 1 add_ib 0 protect 0
0@ += 1
3@ += 1
get_label_pointer 2@ = get_label_addr @Noname_11256
if 
  is_int_lvar_greater_or_equal_to_int_lvar 3@ >= 2@
goto_if_false -10351
set_cleo_shared_var 23290867 to 1
get_label_pointer 21@ = get_label_addr @Noname_10744
get_label_pointer 0@ = get_label_addr -11785
wait 500
goto -1107
goto -10597
if 
  30@ == 4
goto_if_false -10563
set_cleo_shared_var 23290674 to 0
wait 200
if 
  is_button_pressed 3 pressed_key 5
goto_if_false -10538
gosub @Noname_10676
goto -1107
goto -10556
gosub @Noname_10608
wait 0
goto -10500
goto -10597
if 
  30@ == 5
goto_if_false -10597
set_cleo_shared_var 23290674 to 0
goto @Noname_9041
wait 0
goto -9793
get_game_version 30@
if 
  30@ == 17
goto_if_false -10656
write_memory 2833896 value 0.0 size 4 add_ib 1 protect 1
goto -10674
write_memory 2571800 value 0.0 size 4 add_ib 1 protect 1

:Noname_10608
return 
get_game_version 30@
if 
  30@ == 17
goto_if_false @Noname_10724
write_memory 2833896 value 255.0 size 4 add_ib 1 protect 1
goto @Noname_10742
write_memory 2571800 value 255.0 size 4 add_ib 1 protect 1

{$Include Includes\TheFuckingNops.h}
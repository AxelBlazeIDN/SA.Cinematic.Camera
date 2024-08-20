{$CLEO .csa}

// Mod By HAF
// Share By RipzzSA
// Unlocked By Axel Blaze Using ***************
// Thx RipzzSA (Stealer) :) 

:Axel_Blaze
if 
  0@ == 1
goto_if_false -386
get_cleo_shared_var 0@ = get_mutex_var 23290674
if 
  0@ == 2
goto_if_false -386
9@ = 0
set_var_text_label $1191(9@,35s) = "CC1CC"
9@ += 1
10@ -= 1
goto -369
get_touch_point_state 31@ = get_touch_point_state 3 mintime 0
if and
  31@ == 1
  4 > 10@
  is_int_lvar_greater_or_equal_to_int_lvar 30@ >= 32@
goto_if_false -369
set_lvar_int_to_lvar_int 32@ = 30@
32@ += 200
10@ += 1
set_cleo_shared_var 23290675 to 10@
gosub -393
goto -48
gosub -959
set_text_font 3
set_text_centre 1
set_text_colour 255 255 255 255
set_text_scale 1.2 1.5
display_text 11@ 17.0 GXT "CC0CC"
draw_rect 11@ 25.0 size 135.0 35.0 RGBA 80 80 220 255
9@ = 0
12@ = 50.0
if 
  is_int_lvar_equal_to_int_lvar 9@ == 10@
goto_if_false -612
draw_rect 11@ 12@ size 135.0 20.0 RGBA 255 255 255 255
gosub -801
set_lvar_float_to_lvar_float 1@ = 12@
1@ -= 7.5
set_lvar_float_to_lvar_float 2@ = 11@
2@ -= 60.0
display_text 2@ 1@ GXT $1191(9@,34s)
goto -696
draw_rect 11@ 12@ size 135.0 20.0 RGBA 0 0 0 100
gosub @Noname_733
set_lvar_float_to_lvar_float 1@ = 12@
1@ -= 7.5
set_lvar_float_to_lvar_float 2@ = 11@
2@ -= 60.0
display_text 2@ 1@ GXT $1191(9@,34s)
12@ += 20.0
9@ += 1
if 
  9@ > 4
goto_if_false -498
return 
set_text_right_justify 0
set_text_dropshadow 0 rgba 0 0 0 0
set_text_dropshadow 1 rgba 0 0 0 0
set_text_dropshadow 2 rgba 0 0 0 0
set_text_colour 255 255 255 255
set_text_scale 1.1 1.3

:Noname_733
return 
set_text_right_justify 0
set_text_dropshadow 0 rgba 0 0 0 0
set_text_dropshadow 1 rgba 0 0 0 0
set_text_dropshadow 2 rgba 0 0 0 0
set_text_colour 0 0 0 255
set_text_scale 1.1 1.3
return 
set_text_right_justify 0
set_text_dropshadow 0 rgba 0 0 0 0
set_text_dropshadow 1 rgba 0 0 0 0
set_text_dropshadow 2 rgba 0 0 0 0
set_text_colour 0 0 0 255
set_text_scale 1.5 1.9
return 
hex
 "_ZN5CDraw15ms_fAspectRatioE" 00
end
get_label_pointer 0@ = get_label_addr -1100
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
0@ += 4
read_memory 1@ = read_mem_addr 0@ size 4 add_ib 0
cset_lvar_float_to_lvar_int 1@ = integer 1@
get_label_pointer 0@ = get_label_addr -931
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
read_memory 2@ = read_mem_addr 0@ size 4 add_ib 0
2@ *= 480.0
set_lvar_float_to_lvar_float 11@ = 2@
div_float_lvar_by_float_lvar 11@ /= 1@
11@ *= 180.0
2@ -= 640.0
2@ *= 0.5
sub_float_lvar_from_float_lvar 11@ -= 2@
return 
hex
 "RsGlobal" 00
end

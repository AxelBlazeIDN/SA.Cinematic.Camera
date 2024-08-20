{$CLEO .csa}

// Mod By HAF
// Shared By RipzzSA
// Unlocked By Axel Blaze Using ***************
// Thx RipzzSA (Stealer) :) 

:UnlockedByAB
get_offset_from_object_in_world_coords 
hex
 04 2F
end
gosub -2090
0@ += 4
read_memory 2@ = read_mem_addr 0@ size 4 add_ib 0
2@ -= 25.0
write_memory 0@ value 2@ size 4 add_ib 0 protect 1
read_memory 2@ = read_mem_addr 0@ size 4 add_ib 0
get_offset_from_object_in_world_coords 1 
1@ = 46
gosub -2090
0@ += 12
write_memory 0@ value 2@ size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 52
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 35.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 53
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 145.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 44
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 90.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 330.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 45
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 90.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 99
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 495.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 100
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 610.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 97
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 555.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 330.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 98
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 555.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 25.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 48
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 285.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 49
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 355.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 400.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
wait 0
7@ = 35.0
gosub -2144
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 76
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 5@ size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 330.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
7@ = 145.0
gosub -2144
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ = 77
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
write_memory 0@ value 5@ size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 330.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
0@ += 4
write_memory 0@ value 15.0 size 4 add_ib 0 protect 1
goto -1761
get_label_pointer 0@ = get_label_addr @Noname_2346
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
1@ *= 4
add_int_lvar_to_int_lvar 0@ += 1@
read_memory 0@ = read_mem_addr 0@ size 4 add_ib 0
0@ += 12
return 
get_label_pointer 0@ = get_label_addr -2337
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
0@ += 4
read_memory 3@ = read_mem_addr 0@ size 4 add_ib 0
cset_lvar_float_to_lvar_int 3@ = integer 3@
get_label_pointer 0@ = get_label_addr @Noname_2309
find_function_by_name 0@ = get_func_addr_by_cstr_name 0@
read_memory 4@ = read_mem_addr 0@ size 4 add_ib 0
4@ *= 480.0
set_lvar_float_to_lvar_float 5@ = 4@
set_lvar_float_to_lvar_float 6@ = 3@
6@ /= 640.0
mult_float_lvar_by_float_lvar 6@ *= 7@
div_float_lvar_by_float_lvar 5@ /= 3@
mult_float_lvar_by_float_lvar 5@ *= 6@
4@ -= 640.0
4@ *= 0.5
sub_float_lvar_from_float_lvar 5@ -= 4@
return 
hex
 "_ZN5CDraw15ms_fAspectRatioE" 00 
end

:Noname_2309
hex
 "etsE" 00 B3 6C 65 6F 68 AE DF EB FF FF AC AD BC FF 00 00
 00 FF 84 DB BC B3 BA B0 DF D1 9C 8C 82 F2 F5 95
end

:Noname_2346
hex
 8A 92 8F DF BF 93 9C 90 94 9A 9B 9D 86 97 9E 99
 F2 F5 D0 D0 DF 95 9E 91 98 9E 91 DF 92 9A 91 98
 9E 92 9D 96 93 DF 97 9E 93 DF 90 8D 9E 91 98 DF
 93 9E 96 91 F2 F5 C5 93 9C
end

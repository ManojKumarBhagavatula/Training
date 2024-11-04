# # 6*K4AQf]gpi
# # Nainika
# (@HR*i{kcQl
# Vyom
good_string = input("Enter good string: ")
name = input("Enter name: ")
prev_good_char = good_string[0]
total_distance = 0

for currChar in name:
    if currChar not in good_string: 
      
        minValues = [abs(ord(currChar) - ord(i)) for i in good_string]
        minVal = min(minValues)
        chars = [good_string[i] for i, val in enumerate(minValues) if val == minVal]
        if len(chars) == 1:
            total_distance += minVal
            prev_good_char = chars[0]
        else:
            closest_char_distance = min([abs(ord(val) - ord(prev_good_char)) for val in chars])
            total_distance += closest_char_distance
            prev_good_char = min(chars, key=lambda x: abs(ord(x) - ord(prev_good_char)))
    else:
        prev_good_char = currChar

print(f"Total distance: {total_distance}")

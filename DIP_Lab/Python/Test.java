Let 'r' is the old intensity of a pixel and 's' is the new intensity. Let
'c' and 'p' are two positive constants. You can assume any value for 'c
and 'p'. For 'epsilon' choose very small value, such as 0.0000001. 'T1'
and 'T2' are two thresholds. You can assume any value in the range 0 -
255.

Check what happens for the following transformations:
s = 100, if r >= T1 and r <= T2; otherwise
           s = 10.
s = 100, if r >= T1 and r <= T2; otherwise
           s = r.
s = c log(1 + r) .
s = c ( r + epsilon ) ^ p
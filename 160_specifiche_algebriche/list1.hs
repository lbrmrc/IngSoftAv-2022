ins :: Ord a => (a,[a]) -> [a]
ins(e,[]) = [e]
ins(e,h:l) =
   if e <= h
   then e:(h:l)
   else h:(ins(e,l))

sorted :: Ord a => [a] -> Bool
sorted [] = True
sorted [_] = True
sorted (e:(h:t)) = e <= h && sorted(h:t)
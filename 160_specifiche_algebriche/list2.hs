data Lista el = Nil | Cons el (Lista el)

ins :: Ord el => el -> Lista el -> Lista el
ins e Nil = Cons e Nil
ins e (Cons h t) =
   if e <= h
   then Cons e (Cons h t)
   else Cons h (ins e t)

sorted :: Ord el => (Lista el) -> Bool
sorted Nil = True
sorted (Cons _ Nil) = True
sorted (Cons e (Cons h t)) = e <= h && sorted (Cons h t)
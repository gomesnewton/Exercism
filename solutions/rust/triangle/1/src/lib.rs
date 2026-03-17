pub struct Triangle {
    sides: [u64; 3],
}

impl Triangle {
    pub fn build(sides: [u64; 3]) -> Option<Triangle> {
        let output = match Self::is_valid(sides) {
            true => Some(Triangle { sides }),
            false => None,
        };
        output
    }

    pub fn is_equilateral(&self) -> bool {
        (self.sides[0] == self.sides[1]) && (self.sides[1] == self.sides[2]) && (self.sides[0] == self.sides[2])
    }

    pub fn is_scalene(&self) -> bool {
        (self.sides[0] != self.sides[1]) && (self.sides[1] != self.sides[2]) && (self.sides[0] != self.sides[2])
    }

    pub fn is_isosceles(&self) -> bool {
        (self.sides[0] == self.sides[1]) || (self.sides[1] == self.sides[2]) || (self.sides[0] == self.sides[2])
    }

    fn is_valid(sides: [u64; 3]) -> bool {
        Self::all_zero_sides_is_not_a_triangle(sides) && Self::triangle_inequality_violation(sides)
    }

    fn all_zero_sides_is_not_a_triangle(sides : [u64; 3]) -> bool {
        (sides[0] != 0) || (sides[1] != 0) || (sides[2] != 0)
    }

    fn triangle_inequality_violation(sides: [u64; 3]) -> bool {
        (sides[0] + sides[1] >= sides[2]) && (sides[1] + sides[2] >= sides[0]) && (sides[0] + sides[2] >= sides[1])
    }

}

var chai = require("chai");
var expect = chai.expect;
var Media = require("../routines/media");

describe("Calcular Média", () => {

    describe("Apenas notas das unidades", () => {
        it("I unid = 7; 2 unid = 9; média = 8", () => {
            expect(Media.calcularMedia(7, 9, null, null)).to.equal(8);
        })

        it("I unid = 5; 2 unid = 3; média = 4", () => {
            expect(Media.calcularMedia(5, 3, null, null)).to.equal(4);
        })
    })

    describe("Com nota de segunda chamada", () => {
        it("I unid = 7; 2 cham = 9; média = 8", () => {
            expect(Media.calcularMedia(7, null, 9, null)).to.equal(8);
        })

        it("II unid = 7; 2 cham = 9; média = 8", () => {
            expect(Media.calcularMedia(null, 7, 9, null)).to.equal(8);
        })

        it("2 cham = 8; média = 4", () => {
            expect(Media.calcularMedia(null, null, 8, null)).to.equal(4);
        })
    })

    describe("Com nota de final", () => {
        it("I unid = 5; 2 unid = 3; final = 8; média = 4", () => {
            expect(Media.calcularMedia(5, 3, null, 8)).to.equal(6);
        })

        it("I unid = 6; 2 cham = 4; final = 9; média = 7", () => {
            expect(Media.calcularMedia(6, null, 4, 9)).to.equal(7);
        })

        it("II unid = 4; 2 cham = 8; final = 6; média = 6", () => {
            expect(Media.calcularMedia(null, 4, 8, 6)).to.equal(6);
        })

        it("2 cham = 8; final = 6; média = 5", () => {
            expect(Media.calcularMedia(null, null, 8, 6)).to.equal(5);
        })
    })
})



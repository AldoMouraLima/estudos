// var assert = require("assert");
var chai = require("chai");
var expect = chai.expect;

var MatriculaDisciplina = require("../lib/matriculaDisciplina");

describe("Teste das Funções da lib", () => {
    describe("Calcular Media", () => {

       it("I unidade = 10 | II Unidade = 8 | Média = 9", () => {
        expect(MatriculaDisciplina.calcularMedia(10, 8, undefined, undefined)).to.equal(9);
       });

    })   

    describe("Calcular Media com Substitutiva", () => {
       // Com substitutiva
       it("I unidade = 10 | Substitutiva = 8 | Média = 9", () => {
        expect(MatriculaDisciplina.calcularMedia(10, undefined, 8, undefined)).to.equal(9);
       });

       it("II unidade = 10 | Substitutiva = 8 | Média = 9", () => {
        expect(MatriculaDisciplina.calcularMedia(undefined, 10, 8, undefined)).to.equal(9);
       });

       it("Substitutiva = 8 | Média = 4", () => {
        expect(MatriculaDisciplina.calcularMedia(undefined, undefined, 8, undefined)).to.equal(4);
       });

    })   

    describe("Calcular Media sem Final", () => {
       // Sem final
       it("I unidade = 3 | II Unidade = 1 | Média = 2", () => {
        expect(MatriculaDisciplina.calcularMedia(3, 1, undefined, undefined)).to.equal(2);
       });

       it("I unidade = 4 | II Unidade = 2 | Média = 3", () => {
        expect(MatriculaDisciplina.calcularMedia(4, 2, undefined, undefined)).to.equal(3);
       });

       it("I unidade = 4 | II Unidade = 6 | Média = 5", () => {
        expect(MatriculaDisciplina.calcularMedia(4, 6, undefined, undefined)).to.equal(5);
       });

    })   

    describe("Calcular Media com Final", () => {
       // Com final
       it("I unidade = 4 | II Unidade = 2 | Média Parcial = 3 | Final = 5 | Média Final = 4", () => {
        expect(MatriculaDisciplina.calcularMedia(4, 2, undefined, 5)).to.equal(4);
       });
       
       it("I unidade = 3 | II Unidade = 5 | Média Parcial = 4 | Final = 8 | Média Final = 6", () => {
        expect(MatriculaDisciplina.calcularMedia(3, 5, undefined, 8)).to.equal(6);
       });

       it("I unidade = 8 | II Unidade = 4 | Média Parcial = 6 | Final = 0 | Média Final = 3", () => {
        expect(MatriculaDisciplina.calcularMedia(8, 4, undefined, 0)).to.equal(3);
       });

    })
})